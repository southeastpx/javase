package cn.pauu.javase.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

/*
 * ��������ͨ���ͻ����������ļ�
 */
public class TestChannel {
	// Charset�ַ���
	@Test
	public void test6() throws IOException {
		Charset cs1 = Charset.forName("UTF-8");
		Charset cs2 = Charset.forName("UTF-8");
		CharBuffer cBuf = CharBuffer.allocate(1024);
		cBuf.put("�й��ð���");
		cBuf.flip();
		System.out.println("1==" + cBuf.toString());
		ByteBuffer bBuf = cs1.encode(cBuf);
		System.out.println("2==" + new String(bBuf.array(), 0, bBuf.limit(), cs1));
		CharBuffer cBuf2 = cs2.decode(bBuf);
		System.out.println("3==" + cBuf2.toString());
	}

	@Test
	public void test5() {
		Map<String, Charset> map = Charset.availableCharsets();
		Set<Entry<String, Charset>> set = map.entrySet();
		for (Entry<String, Charset> entry : set) {
			System.out.println(entry.getKey() + "==" + entry.getValue());
		}
	}

	// ��ɢ��ȡ��ۼ�д��
	@Test
	public void test4() throws IOException {
		RandomAccessFile raf1 = new RandomAccessFile("CopyMp4Demo3.java", "rw");
		FileChannel channel = raf1.getChannel();
		ByteBuffer buf1 = ByteBuffer.allocate(100);
		ByteBuffer buf2 = ByteBuffer.allocate(1024);
		ByteBuffer[] bufs = { buf1, buf2 };
		channel.read(bufs);
		for (ByteBuffer buf : bufs) {
			buf.flip();
		}
		System.out.println(new String(bufs[0].array(), 0, bufs[0].limit()));
		System.out.println("-----------------------");
		System.out.println(new String(bufs[1].array(), 0, bufs[1].limit()));
		RandomAccessFile raf2 = new RandomAccessFile("channel.txt", "rw");
		FileChannel channel2 = raf2.getChannel();
		channel2.write(bufs);
		channel.close();
		channel2.close();
	}

	// ֱ�ӻ�����(�򻯰�)
	@Test
	public void test3() throws IOException {
		FileChannel inChannel = FileChannel.open(Paths.get("basa.jpg"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("ChannelCopy2.jpg"), StandardOpenOption.WRITE,
				StandardOpenOption.CREATE);
		inChannel.transferTo(0, inChannel.size(), outChannel);
		outChannel.close();
		inChannel.close();
	}

	// ֱ�ӻ��������ڴ�ӳ���ļ���
	@Test
	public void test2() throws IOException {
		FileChannel inChannel = FileChannel.open(Paths.get("basa.jpg"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("ChannelCopy.jpg"), StandardOpenOption.READ,
				StandardOpenOption.WRITE, StandardOpenOption.CREATE_NEW);
		// �ڴ�ӳ���ļ����������ڴ��У�
		MappedByteBuffer inMappedBuf = inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());
		MappedByteBuffer outMappedBuf = outChannel.map(MapMode.READ_WRITE, 0, inChannel.size());
		byte[] bys = new byte[1024];
		inMappedBuf.get(bys);
		outMappedBuf.put(bys);
		outChannel.close();
		inChannel.close();
	}

	// ��ֱ�ӻ�����
	@Test
	public void test1() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			fis = new FileInputStream("basa.jpg");
			fos = new FileOutputStream("Copy.jpg");
			inChannel = fis.getChannel();
			outChannel = fos.getChannel();
			ByteBuffer buf = ByteBuffer.allocate(1024);
			while ((inChannel.read(buf)) != -1) {
				buf.flip();
				outChannel.write(buf);
				buf.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outChannel != null) {
				try {
					outChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (inChannel != null) {
				try {
					inChannel.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
