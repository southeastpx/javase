package cn.pauu.javase.nio;

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

public class TestNonBlockingNIO2 {
	@Test
	public void send() throws IOException {
		DatagramChannel dcChannel = DatagramChannel.open();
		dcChannel.configureBlocking(false);
		Scanner sc = new Scanner(System.in);
		ByteBuffer buf = ByteBuffer.allocate(1024);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			buf.put((new Date() + ":\n" + str).getBytes());
			buf.flip();
			dcChannel.send(buf, new InetSocketAddress("127.0.0.1", 9897));
			buf.clear();
		}
		dcChannel.close();
	}

	@Test
	public void receive() throws IOException {
		DatagramChannel dcChannel = DatagramChannel.open();
		dcChannel.configureBlocking(false);
		dcChannel.bind(new InetSocketAddress(9897));
		Selector selector = Selector.open();
		dcChannel.register(selector, SelectionKey.OP_READ);
		while (selector.select() > 0) {
			Iterator<SelectionKey> it = selector.selectedKeys().iterator();
			while (it.hasNext()) {
				SelectionKey selectionKey = it.next();
				if (selectionKey.isReadable()) {
					ByteBuffer buf = ByteBuffer.allocate(1024);
					dcChannel.receive(buf);
					buf.flip();
					System.out.println(new String(buf.array(), 0, buf.limit()));
					buf.clear();
				}
			}
			it.remove();
		}
		dcChannel.close();
	}
}
