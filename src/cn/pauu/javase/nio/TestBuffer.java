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
		// 1.����һ��ָ����С�Ļ�����
		ByteBuffer buf = ByteBuffer.allocate(1024);
		System.out.println("----------allocate()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 2.����put()�������ݵ�������
		buf.put(str.getBytes());
		System.out.println("----------put()-------------");
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		// 3.�л�����ȡ����ģʽ
		buf.flip();
		System.out.println("----------flip()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 4.����get()��ȡ�������е�����
		byte[] bys = new byte[buf.limit()];
		buf.get(bys);
		System.out.println(new String(bys, 0, bys.length));
		System.out.println("----------get()-------------");
		System.out.println(buf.position());// 5
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 5.rewind()���ظ���
		buf.rewind();
		System.out.println("----------rewind()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 5
		System.out.println(buf.capacity());// 1024
		// 6.clear()��ջ�������ʵ�����Ǵ��ڱ�����״̬,���ݻ��ڻ�����
		buf.clear();
		System.out.println("----------clear()-------------");
		System.out.println(buf.position());// 0
		System.out.println(buf.limit());// 1024
		System.out.println(buf.capacity());// 1024
		System.out.println((char) buf.get());
	}
}
