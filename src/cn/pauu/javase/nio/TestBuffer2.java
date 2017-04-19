package cn.pauu.javase.nio;

import java.nio.ByteBuffer;

import org.junit.Test;

public class TestBuffer2 {
	@Test
	public void test3() {
		// ����ֱ�ӻ�����
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
		// 1.���仺����
		System.out.println("-------------allocate()-------------");
		ByteBuffer buf = ByteBuffer.allocate(1024);
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 2.�򻺳�����д������
		System.out.println("-------------put()-------------");
		buf.put("abcde".getBytes());
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 3.�л�����ģʽ
		System.out.println("-------------flip()-------------");
		buf.flip();
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 4.��ȡ����
		System.out.println("-------------get()-------------");
		byte[] dst = new byte[buf.limit()];
		buf.get(dst, 0, buf.limit());
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 5.���ظ���ȡ
		System.out.println("-------------rewind()-------------");
		buf.rewind();
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 6.��ջ���������ʵ���ݻ��ڣ�ֻ�ǳ��ڱ�����״̬��
		System.out.println("-------------clear()-------------");
		buf.clear();
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
	}
}
