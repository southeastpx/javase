package cn.pauu.javase.random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random(11111);
		for (int i = 0; i < 100; i++) {
			int num = r.nextInt(100)+1;
			System.out.println(num);
		}
		
	}
}
