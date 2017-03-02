package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("fis.txt");
			int by = 0;
			while ((by = fis.read()) != -1) {
				System.out.print((char) by);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
