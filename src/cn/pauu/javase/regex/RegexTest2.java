package cn.pauu.javase.regex;

import java.util.Scanner;

/*
 * У������
 */
public class RegexTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�������:");
		String email = sc.nextLine();
		String regex = "\\w+@\\w+(.\\w{2,3})+";
		System.out.println("email:"+email.matches(regex));
	}
}
