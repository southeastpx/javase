package cn.pauu.javase.character;

import java.util.Scanner;

public class CharacterTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
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
		System.out.println(str + "������д��ĸ" + upperCount + "����");
		System.out.println(str + "����Сд��ĸ" + lowCount + "����");
		System.out.println(str + "��������" + numCount + "����");
	}
}
