package com.pauu.javase.string;

import java.util.Scanner;

public class GuessNumberGame {
	private GuessNumberGame() {
	}

	public static void start() {
		int number =(int)(Math.random()*100)+1;
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个数字(1-100):");
			int guessNumber = sc.nextInt();
			if(guessNumber > number){
				System.out.println("猜的数据大了！");
			}else if(guessNumber == number){
				System.out.println("恭喜你，猜中了！");
				break;
			}else{
				System.out.println("猜的数据小了！");
			}
		}
	}

}
