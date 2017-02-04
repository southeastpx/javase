package cn.pauu.javase.math;

import java.util.Scanner;

public class MathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始值:");
		int start = sc.nextInt();
		System.out.println("请输入结束值:");
		int end = sc.nextInt();
		for(int x=0;x<100;x++){
			System.out.println(getRandom(start,end));
		}
	}

	// 获取给定范围内的整数值
	public static int getRandom(int start, int end) {
		return (int) (Math.random() * (end - start + 1)) + start;
	}
}
