package cn.pauu.javase.exception;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		//method();
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void method2() throws Exception {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new Exception();
		} else {
			System.out.println(a / b);
		}
	}

	private static void method() {
		int a = 10;
		int b = 0;
		if (b == 0) {
			throw new ArithmeticException();
		} else {
			System.out.println(a / b);
		}
	}
}
