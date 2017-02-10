package cn.pauu.javase.jdk5new;

public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println("result:" + result);
		int c = 30;
		result = sum(a, b, c);
		System.out.println("result:" + result);
	}

	private static int sum(int... args) {
		int result = 0;
		for (int x : args) {
			result += x;
		}
		return result;
	}
}
