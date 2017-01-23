package com.pauu.javase.stringbuffer;

public class StringBufferTest {
	public static void main(String[] args) {
		String s = "hello";
		StringBuffer sb = new StringBuffer(s);
		System.out.println("sb:" + sb);
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb2:" + sb2);
		System.out.println("---------------------------");
		StringBuffer buffer = new StringBuffer("java");
		String str = new String(buffer);
		System.out.println("str:" + str);
		String str2 = buffer.toString();
		System.out.println("str2:" + str2);
	}
}
