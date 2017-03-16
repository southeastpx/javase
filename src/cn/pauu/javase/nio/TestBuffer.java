package cn.pauu.javase.nio;

import java.nio.ByteBuffer;

import org.junit.Test;

public class TestBuffer {
	@Test
	public void test2() {
		ByteBuffer buf = ByteBuffer.allocate(1024);
		buf.put("abcde".getBytes());
		buf.flip();
		byte[] bys = new byte[buf.limit()];
		buf.get(bys, 0, 2);
		System.out.println(new String(bys, 0, bys.length));
		System.out.println("position:" + buf.position());
		buf.mark();
		buf.get(bys, 2, 2);
		System.out.println(new String(bys, 0, bys.length));
		System.out.println("position:" + buf.position());
		buf.reset();
		System.out.println("reset-->position:" + buf.position());
		if (buf.hasRemaining()) {
			buf.get(bys, buf.position(), buf.remaining());
			System.out.println(new String(bys, 2, 3));
		}
	}

	@Test
	public void test1() {
		String str = "abcde";
		// 1.分配一个指定大小的缓冲区
		ByteBuffer buf = ByteBuffer.allocate(1024);
		System.out.println("----------allocate()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 2.利用put()放入数据到缓冲区
		buf.put(str.getBytes());
		System.out.println("----------put()-------------");
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 3.切换到读取数据模式
		buf.flip();
		System.out.println("----------flip()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 4.利用get()读取缓冲区中的数据
		byte[] bys = new byte[buf.limit()];
		buf.get(bys);
		System.out.println(new String(bys, 0, bys.length));
		System.out.println("----------get()-------------");
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 5.rewind()可重复读
		buf.rewind();
		System.out.println("----------rewind()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 6.clear()清空缓冲区，实际上是处于被遗忘状态,数据还在缓冲区
		buf.clear();
		System.out.println("----------clear()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		System.out.println((char) buf.get());
	}
}
