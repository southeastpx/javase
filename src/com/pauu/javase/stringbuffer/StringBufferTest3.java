package com.pauu.javase.stringbuffer;

import java.util.Scanner;

public class StringBufferTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数据：");
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse().toString());
	}
}
