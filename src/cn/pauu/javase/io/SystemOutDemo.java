package cn.pauu.javase.io;

import java.io.PrintStream;

/*
 * ����׼������ı���
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.println("hello");
		ps.println(true);
	}
}
