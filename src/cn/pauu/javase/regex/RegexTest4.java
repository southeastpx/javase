package cn.pauu.javase.regex;

public class RegexTest4 {
	public static void main(String[] args) {
		String str = "aa,bb,cc";
		String[] strArray = str.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("-----------------------------");
		String str1 = "aa.bb.cc";
		String[] str1Array = str1.split("\\.");
		for (int i = 0; i < str1Array.length; i++) {
			System.out.println(str1Array[i]);
		}
		System.out.println("-----------------------------");
		String str2 = "D:\\学习资料\\一步一步尚学堂\\01-JavaSe\\传智播客_2015年Java基础视频-深入浅出精华版\\day14\\avi";
		String[] str2Array = str2.split("\\\\");
		for (int i = 0; i < str2Array.length; i++) {
			System.out.println(str2Array[i]);
		}
	}
}
