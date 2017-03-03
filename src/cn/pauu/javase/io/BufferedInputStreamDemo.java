package cn.pauu.javase.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("bos.txt"));
			int by = 0;
			while ((by = bis.read()) != -1) {
				System.out.print((char)by);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
