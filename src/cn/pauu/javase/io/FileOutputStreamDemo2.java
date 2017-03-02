package cn.pauu.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos2.txt");
			byte[] bytes = { 97, 98, 99, 100, 101 };
			fos.write(bytes);
			fos.write(bytes, 1, 3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
