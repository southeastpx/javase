package cn.pauu.javase.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("pw.txt");
			pw.write("hello");
			pw.write("world");
			pw.write("java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			pw.close();
		}
	}
}
