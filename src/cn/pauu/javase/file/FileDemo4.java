package cn.pauu.javase.file;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
	public static void main(String[] args) throws IOException {
		//File file = new File("����ϼ.jpg");
		//file.createNewFile();
		File file2 = new File("��������.jpg");
		//file.renameTo(file2);
		File file3 = new File("d:\\����.jpg");
		file2.renameTo(file3);
	}
}
