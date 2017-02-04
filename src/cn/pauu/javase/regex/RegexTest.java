package cn.pauu.javase.regex;

import java.util.Scanner;

public class RegexTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个手机号码:");
		String phone = sc.nextLine();
		String regex = "1[38]\\d{9}";
		System.out.println("phone:"+phone.matches(regex));
	}
}
