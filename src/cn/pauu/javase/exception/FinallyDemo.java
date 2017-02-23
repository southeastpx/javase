
package cn.pauu.javase.exception;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println(method());//30,finally
	}

	private static int method() {
		int a = 10;
		try {
			System.out.println(a / 0);
			a = 20;
		} catch (Exception e) {
			a = 30;
			return a;
		} finally {
			a = 40;
		}
		return a;
	}
}
