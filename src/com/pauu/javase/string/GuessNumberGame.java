package com.pauu.javase.string;

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {
	}

	public static void start() {
		int number =(int)(Math.random()*100)+1;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("������һ������(1-100):");
			int guessNumber = sc.nextInt();
			if(guessNumber > number){
				System.out.println("�µ����ݴ��ˣ�");
			}else if(guessNumber == number){
				System.out.println("��ϲ�㣬�����ˣ�");
				break;
			}else{
				System.out.println("�µ�����С�ˣ�");
			}
		}
	}

}
