package cn.pauu.javase.regex;

import java.util.Scanner;

public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄqqºÅÂë:");
		String qq = sc.nextLine();
		System.out.println("checkQQ:"+checkQQ(qq));
	}

	public static boolean checkQQ(String qq) {
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() <= 15) {
			if (!qq.startsWith("0")) {
				char[] chs = qq.toCharArray();
				for (int i = 0; i < chs.length; i++) {
					char ch = chs[i];
					if(!Character.isDigit(ch)){
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}
}
