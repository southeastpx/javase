package cn.pauu.javase.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamDemo {
	public static void main(String[] args) {
		// 往内存中写数据
		ByteArrayOutputStream baos = null;
		ByteArrayInputStream bios = null;
		try {
			baos = new ByteArrayOutputStream();
			for (int x = 0; x < 10; x++) {
				baos.write(("hello" + x).getBytes());
			}
			byte[] bys = baos.toByteArray();
			bios = new ByteArrayInputStream(bys);
			int by = 0;
			while ((by = bios.read()) != -1) {
				System.out.print((char) by);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
