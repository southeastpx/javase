package cn.pauu.javase.io;
/*
 * 需求：通过udp方式进行NIO形式的网络传输
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.Test;

public class TestNonBlockingDemo2 {
	// 发送端
	@Test
	public void send() throws IOException {
		DatagramChannel datagramChannel = DatagramChannel.open();
		datagramChannel.configureBlocking(false);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			buf.put((new Date().toString() + "\n" + str).getBytes());
			buf.flip();
			datagramChannel.send(buf, new InetSocketAddress("127.0.0.1", 9898));
			buf.clear();
		}
		datagramChannel.close();
	}

	// 接收端
	@Test
	public void receive() throws IOException {
		DatagramChannel datagramChannel = DatagramChannel.open();
		datagramChannel.configureBlocking(false);
		datagramChannel.bind(new InetSocketAddress(9898));
		Selector selector = Selector.open();
		datagramChannel.register(selector, SelectionKey.OP_READ);
		while (selector.select() > 0) {
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while (it.hasNext()) {
				SelectionKey sk = it.next();
				if (sk.isReadable()) {
					ByteBuffer buf = ByteBuffer.allocate(1024);
					datagramChannel.receive(buf);
					System.out.println(new String(buf.array(), 0, buf.limit()));
				}
			}
			it.remove();
		}
	}
}
