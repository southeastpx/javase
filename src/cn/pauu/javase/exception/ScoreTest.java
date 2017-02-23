package cn.pauu.javase.exception;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生分数:");
		int score = scanner.nextInt();
		Teacher teacher = new Teacher();
		try {
			teacher.check(score);
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
}
