package cn.pauu.javase.character;

import java.util.Scanner;

public class CharacterTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = s.nextLine();
		splitStr(str);
	}

	private static void splitStr(String str) {
		int upperCount = 0;
		int lowCount = 0;
		int numCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCount++;
			} else if (Character.isLowerCase(ch)) {
				lowCount++;
			} else {
				numCount++;
			}
		}
		System.out.println(str + "包含大写字母" + upperCount + "个！");
		System.out.println(str + "包含小写字母" + lowCount + "个！");
		System.out.println(str + "包含数字" + numCount + "个！");
	}
}
