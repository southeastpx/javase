package cn.pauu.javase.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ����ʹ���ַ��������̨�������
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
