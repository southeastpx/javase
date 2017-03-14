package cn.pauu.javase.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ����ʹ��PrintWriterʵ�������������ݵ�д�룬���Զ�ˢ�ºͻ���
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
