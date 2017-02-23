package cn.pauu.javase.file;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		System.out.println(file.createNewFile());
		File file2 = new File("aaa\\bbb\\ccc");
		System.out.println(file2.mkdirs());
		System.out.println(file.delete());
		System.out.println(file2.delete());
	}
}
