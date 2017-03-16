package cn.pauu.javase.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * JDK7中对NIO的扩展
 */
public class NIODemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Files.copy(Paths.get("CopyMp4Demo3.java"), new
		// FileOutputStream("myMp4.txt"));
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		Files.write(Paths.get("arrayList.txt"), arrayList, Charset.forName("GBK"));
	}
}
