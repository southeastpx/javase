package cn.pauu.javase.recursion;

/*
 * 需求：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，
 * 		小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 		兔子的规律为数列：1, 1, 2, 3, 5, 8, 13, 21 ....
 */
public class RecursionDemo2 {
	public static void main(String[] args) {
		// 法一，通过数组实现
		int[] arr = new int[20];
		arr[0] = 1;
		arr[1] = 1;
		for (int x = 2; x < 20; x++) {
			arr[x] = arr[x - 2] + arr[x - 1];
		}
		System.out.println(arr[19]);
		System.out.println("--------------------");
		// 法二，通过可变变量实现
		/*
		 * 规律：a为上一次的b,b为上一次的a+b
		 */
		int a = 1;
		int b = 1;
		for (int x = 0; x < 18; x++) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		System.out.println(b);

		System.out.println("----------------");
		// 法三，递归调用
		System.out.println(calTuZi(20));
	}

	private static int calTuZi(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return calTuZi(n - 2) + calTuZi(n - 1);
		}
	}
}
