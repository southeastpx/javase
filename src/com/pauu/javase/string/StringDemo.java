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
		// String s1 = "hello";
		// String s2 = "hello";
		// String s3 = "HelLo";
		// System.out.println(s1.equals(s2));//true
		// System.out.println(s1.equals(s3));//false
		// System.out.println(s1.equalsIgnoreCase(s3));//true
		// System.out.println(s1.contains("el"));//true
		// System.out.println(s1.startsWith("he"));//true
		// System.out.println(s1.startsWith("el"));//false
		// System.out.println(s1.endsWith("dd"));//false
		// System.out.println(s1.endsWith("lo"));//true
		// System.out.println(s1.isEmpty());//false
		// String s = "helloworld";
		// System.out.println("length():" + s.length());
		// System.out.println("charAt():" + s.charAt(7));
		// System.out.println("indexOf():" + s.indexOf('l'));
		// System.out.println("indexOf():" + s.indexOf("owo"));
		// System.out.println("indexOf():" + s.indexOf('l', 4));
		// System.out.println("indexOf():" + s.indexOf('k'));
		// System.out.println("substring():" + s.substring(5));
		// System.out.println("substring():" + s.substring(5, 7));
		// System.out.println("substring():" + s.substring(0, s.length()));
		// String s = "helloworld";
		// for (int i = 0; i < s.length(); i++) {
		// if (i == s.length() - 1) {
		// System.out.print(s.charAt(i));
		// } else {
		// System.out.print(s.charAt(i) + ",");
		// }
		// }
		// String s = "Hello123World";
		// int numberCount = 0;// 数字字符个数
		// int lowCount = 0;// 小写字符个数
		// int upperCount = 0;// 大写字符个数
		// for (int i = 0; i < s.length(); i++) {
		// char ch = s.charAt(i);
		// if (ch >= '0' && ch <= '9') {
		// numberCount++;
		// } else if (ch >= 'a' && ch <= 'z') {
		// lowCount++;
		// } else {
		// upperCount++;
		// }
		// }
		// System.out.println("小写字符："+lowCount);
		// System.out.println("大写字符："+upperCount);
		// System.out.println("数字字符："+numberCount);
		// String s = "JavaSE";
		// byte[] bys = s.getBytes();
		// for (int i = 0; i < bys.length; i++) {
		// System.out.println(bys[i]);
		// }
		//
		// char[] chs = s.toCharArray();
		// for(int i=0;i<chs.length;i++){
		// System.out.println(chs[i]);
		// }
		//
		// String ss = String.valueOf(chs);
		// System.out.println(ss);
		//
		// int i = 100;
		// String sss = String.valueOf(i);
		// System.out.println(sss);
		//
		// System.out.println(s.toLowerCase());
		// System.out.println(s.toUpperCase());
		//
		// String ssss = s.concat("haha");
		// System.out.println(ssss);
		// String s = "hEllOWorLd";
		// String newStr = s.substring(0,
		// 1).toUpperCase().concat(s.substring(1).toLowerCase());
		// System.out.println(newStr);
		String s1 = "helloworld";
		String s2 = s1.replace('l', 'k');
		System.out.println("s1:"+s1+",s2:"+s2);
		String s3 = s1.replace("owo", "ak47");
		System.out.println("s3:"+s3);
		String s4 = " hello world ";
		String s5 = s4.trim();
		System.out.println("s4:"+s4+",s5:"+s5);
		String s6 = "hello";
		String s7 = "hello";
		String s8 = "abc";
		String s9 = "xyz";
		System.out.println(s6.compareTo(s7));//0
		System.out.println(s6.compareTo(s8));//7
		System.out.println(s6.compareTo(s9));//-16
	}
}
