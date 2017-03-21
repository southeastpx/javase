package cn.pauu.javase.io;
/*
 * ����ʹ��NIO������紫��
 */

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class TestBlockingDemo {
	// �ͻ���
	@Test
	public void client() throws IOException {
		FileChannel inChannel = FileChannel.open(Paths.get("basa.jpg"), StandardOpenOption.READ);
		SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9898));
		ByteBuffer buf = ByteBuffer.allocate(1024);
		while (inChannel.read(buf) != -1) {
			buf.flip();
			sChannel.write(buf);
			buf.clear();
		}
		// ���߷��������ݷ������
		sChannel.shutdownOutput();
		// ���շ���������
		int len = 0;
		while ((len = sChannel.read(buf)) != -1) {
			buf.flip();
			System.out.println(new String(buf.array(), 0, len));
			buf.clear();
		}
		sChannel.close();
		inChannel.close();
	}

	// ��������
	@Test
	public void server() throws IOException {
		FileChannel outChannel = FileChannel.open(Paths.get("iii.jpg"), StandardOpenOption.WRITE,
				StandardOpenOption.CREATE);
		ServerSocketChannel ssChannel = ServerSocketChannel.open();
		ssChannel.bind(new InetSocketAddress(9898));
		SocketChannel sChannel = ssChannel.accept();
		ByteBuffer buf = ByteBuffer.allocate(1024);
		while (sChannel.read(buf) != -1) {
			buf.flip();
			outChannel.write(buf);
			buf.clear();
		}
		// ���ͻ��˷��ͷ���
		buf.put("����˽������ݳɹ�".getBytes());
		buf.flip();
		sChannel.write(buf);
		sChannel.close();
		ssChannel.close();
		outChannel.close();
	}
}
