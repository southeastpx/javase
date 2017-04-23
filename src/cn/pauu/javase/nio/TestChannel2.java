package cn.pauu.javase.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class TestChannel2 {
	/*
	 * ͨ��ǰ�����ݴ���
	 */
	@Test
	public void test3() throws IOException {
		FileChannel inChannel = FileChannel.open(Paths.get("iii.jpg"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("ooo.jpg"), StandardOpenOption.READ,
				StandardOpenOption.WRITE, StandardOpenOption.CREATE);
		inChannel.transferTo(0, inChannel.size(), outChannel);
		outChannel.close();
		inChannel.close();
	}

	/*
	 * ֱ�ӻ���������ļ��ĸ���
	 */
	@Test
	public void test2() throws IOException {
		FileChannel inChannel = FileChannel.open(Paths.get("iii.jpg"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("kkk.jpg"), StandardOpenOption.READ,
				StandardOpenOption.WRITE, StandardOpenOption.CREATE);
		MappedByteBuffer inBuf = inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());
		MappedByteBuffer outBuf = outChannel.map(MapMode.READ_WRITE, 0, inChannel.size());
		byte[] dst = new byte[1024];
		inBuf.get(dst);
		outBuf.put(dst);
		outChannel.close();
		inChannel.close();
	}

	/*
	 * ����ͨ������ļ��ĸ��ƣ���ֱ�ӻ�������
	 */
	@Test
	public void test1() throws Exception {
		FileInputStream fis = new FileInputStream("iii.jpg");
		FileOutputStream fos = new FileOutputStream("jjj.jpg");
		FileChannel inChannel = fis.getChannel();
		FileChannel outChannel = fos.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(1024);
		while (inChannel.read(buf) != -1) {
			buf.flip();
			outChannel.write(buf);
			buf.clear();
		}
		outChannel.close();
		inChannel.close();
		fos.close();
		fis.close();
	}
}