package cn.pauu.javase.regex;

import java.util.Scanner;

public class RegexDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄqqºÅÂë:");
		String qq = sc.nextLine();
		System.out.println("checkQQ:"+checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		//String regex = "[1-9][0-9]{4,14}";
		//return qq.matches("[1-9][0-9]{4,14}"); 
		return qq.matches("[1-9]//d{4,14}");
	}
}
