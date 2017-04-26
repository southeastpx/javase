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
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class TestChannel2 {

	/*
	 * 编码CharSet
	 */
	@Test
	public void test5() throws IOException {
		Map<String, Charset> map = Charset.availableCharsets();
		Set<Entry<String, Charset>> entrySet = map.entrySet();
		for (Entry<String, Charset> entry : entrySet) {
			//System.out.println(entry.getKey() + "=" + entry.getValue());
		}

		Charset cs1 = Charset.forName("GBK");
		CharsetEncoder ce = cs1.newEncoder();
		CharsetDecoder cd = cs1.newDecoder();
		CharBuffer cBuf = CharBuffer.allocate(1024);
		cBuf.put("尚硅谷威武！");
		cBuf.flip();
		ByteBuffer bBuf = ce.encode(cBuf);
		for (int x = 0; x < bBuf.limit(); x++) {
			System.out.println(bBuf.get());
		}
		bBuf.flip();
		CharBuffer cBuf2 = cd.decode(bBuf);
		System.out.println(cBuf2.toString());
	}

	/*
	 * 分散读取和聚集写入
	 */
	@Test
	public void test4() throws IOException {
		// 分散读取
		RandomAccessFile raf1 = new RandomAccessFile("CopyStream.java", "rw");
		FileChannel channel = raf1.getChannel();
		ByteBuffer buf1 = ByteBuffer.allocate(100);
		ByteBuffer buf2 = ByteBuffer.allocate(1024);
		ByteBuffer[] bufs = { buf1, buf2 };
		channel.read(bufs);
		for (ByteBuffer buf : bufs) {
			buf.flip();
		}
		System.out.println(new String(bufs[0].array(), 0, bufs[0].limit()));
		System.out.println("-----------------------------");
		System.out.println(new String(bufs[1].array(), 0, bufs[1].limit()));
		// 聚集写入
		RandomAccessFile raf2 = new RandomAccessFile("ppp.java", "rw");
		FileChannel channel2 = raf2.getChannel();
		channel2.write(bufs);
	}

	/*
	 * 通道前的数据传输
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
	 * 直接缓冲区完成文件的复制
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
	 * 利用通道完成文件的复制（非直接缓冲区）
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
