package com.pauu.javase.string;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û���:");
			String name = sc.nextLine();
			System.out.println("����������:");
			String pwd = sc.nextLine();
			if (name.equals(username) && pwd.equals(password)) {
				System.out.println("��¼�ɹ�,��ʼ����Ϸ��");
				GuessNumberGame.start();
				break;
			} else {
				if ((2 - x) == 0) {
					System.out.println("�˺ű�����������೤��ϵ��");
				} else {
					System.out.println("��¼ʧ�ܣ�������" + (2 - x) + "�λ��ᣡ");
				}
			}
		}
	}
}
