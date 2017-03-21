package cn.pauu.javase.io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

/*
 * 需求：使用非阻塞实现网络IO
 */
public class TestNonBlockingDemo {
	// 客户端
	@Test
	public void client() throws IOException {
		SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9898));
		sChannel.configureBlocking(false);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			buf.put((new Date().toString() + "\n" + str).getBytes());
			buf.flip();
			sChannel.write(buf);
			buf.clear();
		}
		sChannel.close();
	}

	// 服务器端
	@Test
	public void server() throws IOException {
		ServerSocketChannel ssChannel = ServerSocketChannel.open();
		ssChannel.bind(new InetSocketAddress(9898));
		ssChannel.configureBlocking(false);
		Selector selector = Selector.open();
		ssChannel.register(selector, SelectionKey.OP_ACCEPT);
		while (selector.select() > 0) {
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while (it.hasNext()) {
				SelectionKey sk = it.next();
				if (sk.isAcceptable()) {
					SocketChannel sChannel = ssChannel.accept();
					sChannel.configureBlocking(false);
					sChannel.register(selector, SelectionKey.OP_READ);
				} else if (sk.isReadable()) {
					SocketChannel sChannel = (SocketChannel) sk.channel();
					ByteBuffer buf = ByteBuffer.allocate(1024);
					int len = 0;
					while ((len = sChannel.read(buf)) > 0) {
						buf.flip();
						System.out.println(new String(buf.array(), 0, len));
						buf.clear();
					}
				}
				it.remove();
			}
		}
	}
}
