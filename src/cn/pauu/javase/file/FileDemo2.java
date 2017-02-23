package cn.pauu.javase.file;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("d:\\demo");
		System.out.println(file.mkdir());
		File file2 = new File("d:\\demo\\a.txt");
		System.out.println(file2.createNewFile());
		File file3 = new File("d:\\aaa\\bbb\\ccc");
		System.out.println(file3.mkdirs());
	}
}
