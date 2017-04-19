package cn.pauu.javase.nio;

import java.nio.ByteBuffer;

import org.junit.Test;

public class TestBuffer2 {
	@Test
	public void test3() {
		// 分配直接缓冲区
		ByteBuffer buf = ByteBuffer.allocateDirect(1024);
		System.out.println(buf.isDirect());
	}

	@Test
	public void test2() {
		ByteBuffer buf = ByteBuffer.allocate(10);
		buf.put("abcde".getBytes());
		buf.flip();
		byte[] dst = new byte[buf.limit()];
		buf.get(dst, 0, 2);
		System.out.println(buf.position());
		buf.mark();
		buf.put("def".getBytes());
		System.out.println(buf.position());
		buf.reset();
		System.out.println(buf.position());
	}

	@Test
	public void test1() {
		// 1.分配缓冲区
		System.out.println("-------------allocate()-------------");
		ByteBuffer buf = ByteBuffer.allocate(1024);
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 2.向缓冲区中写入数据
		System.out.println("-------------put()-------------");
		buf.put("abcde".getBytes());
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 3.切换到读模式
		System.out.println("-------------flip()-------------");
		buf.flip();
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 4.读取数据
		System.out.println("-------------get()-------------");
		byte[] dst = new byte[buf.limit()];
		buf.get(dst, 0, buf.limit());
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 5.可重复读取
		System.out.println("-------------rewind()-------------");
		buf.rewind();
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 6.清空缓冲区（其实数据还在，只是出于被遗忘状态）
		System.out.println("-------------clear()-------------");
		buf.clear();
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
	}
}
