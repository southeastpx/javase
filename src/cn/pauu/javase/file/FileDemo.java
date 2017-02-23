package cn.pauu.javase.file;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//第一种创建方式
		File file = new File("d:\\demo\\a.txt");
		//第二种创建方式
		File file2 = new File("d:\\demo","a.txt");
		//第三种创建方式
		File file3 = new File("d:\\demo");
		File file4 = new File(file3,"a.txt");
	}
}
