package cn.pauu.javase.enhence;

public class HenceForDemo {
	public static void main(String[] args) {
		System.out.println(getSum(2, 3));
		System.out.println(getSum(2, 3, 5));
	}

	public static int getSum(int x, int... args) {
		int sum = x;
		for (int arg : args) {
			sum += arg;
		}
		return sum;
	}
}
