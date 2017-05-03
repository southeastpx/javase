package cn.pauu.javase.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class TestBlockingNIO {
	@Test
	public void client() throws IOException {
		SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9897));
		FileChannel inChannel = FileChannel.open(Paths.get("iii.jpg"), StandardOpenOption.READ);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		while (inChannel.read(buf) != -1) {
			buf.flip();
			sChannel.write(buf);
			buf.clear();
		}
		sChannel.shutdownOutput();
		// 接收服务端反馈
		ByteBuffer buf2 = ByteBuffer.allocate(1024);
		int len = 0;
		while ((len = sChannel.read(buf2)) != -1) {
			buf2.flip();
			System.out.println(new String(buf2.array(), 0, len));
			buf2.clear();
		}
		inChannel.close();
		sChannel.close();
	}

	@Test
	public void server() throws IOException {
		ServerSocketChannel ssChannel = ServerSocketChannel.open();
		ssChannel.bind(new InetSocketAddress(9897));
		FileChannel outChannel = FileChannel.open(Paths.get("ppp.jpg"), StandardOpenOption.WRITE,
				StandardOpenOption.CREATE);
		SocketChannel sChannel = ssChannel.accept();
		ByteBuffer buf = ByteBuffer.allocate(1024);
		int len = 0;
		while ((len = sChannel.read(buf)) != -1) {
			buf.flip();
			outChannel.write(buf);
			buf.clear();
		}
		// 向客户端发送反馈信息
		ByteBuffer buf2 = ByteBuffer.allocate(1024);
		buf2.put("数据接收成功".getBytes());
		buf2.flip();
		sChannel.write(buf2);
		sChannel.close();
		outChannel.close();
		ssChannel.close();
	}
}
