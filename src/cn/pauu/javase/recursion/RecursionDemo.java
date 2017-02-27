package cn.pauu.javase.recursion;

public class RecursionDemo {
	public static void main(String[] args) {
		int result = calJieCheng(5);
		System.out.println("result:" + result);
	}

	private static int calJieCheng(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * calJieCheng(n - 1);
		}
	}
}
