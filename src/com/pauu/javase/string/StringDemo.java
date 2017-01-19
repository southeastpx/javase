package com.pauu.javase.string;

public class StringDemo {
	public static void main(String[] args) {
		// String s1 = new String();
		// String s2 = "abc";
		// System.out.println("s2:"+s2);
		// System.out.println("s1:" + s1.toString());
		// System.out.println("length:" + s1.length());
		// System.out.println("---------------------");
		// byte[] bytes = {97,98,99,100,101};
		// String s3 = new String(bytes);
		// System.out.println("s3:"+s3);
		//
		// String s4 = new String(bytes,1,3);
		// System.out.println("s4:"+s4);
		//
		// System.out.println("--------------");
		// char[] chs = {'a','b','c','d','e'};
		// String s5 = new String(chs);
		// System.out.println("s5:"+s5);
		// String s6 = new String(chs,1,3);
		// System.out.println("s6:"+s6);

		// System.out.println("--------------");

		// String s = new String("abcde");
		//
		// System.out.println("---------");
		// String s = "hello";
		// s += "world";
		// System.out.println("s"+s);
		// String s1 = new String("hello");
		// String s2 = "hello";
		// System.out.println(s1 == s2);//false
		// System.out.println(s1.equals(s2));//true
		// String s1 = "hello";
		// String s2 = "world";
		// String s3 = "helloworld";
		// System.out.println(s3 == (s1+s2));//false
		// System.out.println(s3 == ("hello"+"world"));//true,编译器会做优化
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "HelLo";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.contains("el"));//true
		System.out.println(s1.startsWith("he"));//true
		System.out.println(s1.startsWith("el"));//false
		System.out.println(s1.endsWith("dd"));//false
		System.out.println(s1.endsWith("lo"));//true
		System.out.println(s1.isEmpty());//false
	}
}
