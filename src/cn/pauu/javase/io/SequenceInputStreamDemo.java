package cn.pauu.javase.io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 * 需求：使用合并流将PrintWriterDemo.java和RandomAccessFileDemo.java复制到CopyStream.java中
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) {
		InputStream s1 = null;
		InputStream s2 = null;
		SequenceInputStream sis = null;
		BufferedOutputStream bos = null;
		try {
			s1 = new FileInputStream("PrintWriterDemo.java");
			s2 = new FileInputStream("RandomAccessFileDemo.java");
			sis = new SequenceInputStream(s1, s2);
			bos = new BufferedOutputStream(new FileOutputStream("CopyStream.java"));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = sis.read(bys)) != -1) {
				bos.write(bys, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (sis != null) {
				try {
					sis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
