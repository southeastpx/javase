package cn.pauu.javase.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo6 {
	public static void main(String[] args) {
		File file = new File("demo\\test.txt");
		System.out.println("getAbsolutePath:" + file.getAbsolutePath());// D:\workspace\javase\demo\test.txt
		System.out.println("getPath:" + file.getPath());// demo\test.txt
		System.out.println("getName:" + file.getName());// test.txt
		System.out.println("length:" + file.length());//12
		System.out.println("lastModified:" + file.lastModified());//1487899974402
		Date d = new Date(1487899974402L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
	}
}
