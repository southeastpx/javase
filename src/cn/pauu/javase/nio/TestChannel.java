package cn.pauu.javase.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.Test;

/*
 * 需求：利用通道和缓冲区复制文件
 */
public class TestChannel {
	// 非直接缓冲区
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
