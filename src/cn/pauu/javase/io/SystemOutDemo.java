package cn.pauu.javase.io;

import java.io.PrintStream;

/*
 * 理解标准输出语句的本质
 */
public class SystemOutDemo {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		ps.println("hello");
		ps.println(true);
	}
}
