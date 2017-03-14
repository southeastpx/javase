package cn.pauu.javase.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 需求：使用字符流向控制台输出数据
 */
public class SystemOutDemo2 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("hello");
		bw.newLine();
		bw.write("world");
		bw.newLine();
		bw.write("java");
		bw.newLine();
		bw.flush();
	}
}
