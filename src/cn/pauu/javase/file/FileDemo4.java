package cn.pauu.javase.file;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
	public static void main(String[] args) throws IOException {
		//File file = new File("林青霞.jpg");
		//file.createNewFile();
		File file2 = new File("东方不败.jpg");
		//file.renameTo(file2);
		File file3 = new File("d:\\黄蓉.jpg");
		file2.renameTo(file3);
	}
}
