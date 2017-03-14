package cn.pauu.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 需求：使用PrintWriter实现任意类型数据的写入，并自动刷新和换行
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter("pw2.txt"), true);
			pw.println("hello");
			pw.println(100);
			pw.println(true);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
