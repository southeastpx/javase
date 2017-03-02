package cn.pauu.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos3.txt", true);
			for (int x = 0; x < 10; x++) {
				fos.write(("hello" + x).getBytes());
				fos.write("\r\n".getBytes());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
