package cn.pauu.javase.integer;

public class IntegerTest {
	public static void main(String[] args) {
		// int -- String
		int number = 100;
		// 方式1
		String s1 = "" + 100;
		System.out.println("s1:" + s1);
		// 方式2(推荐)
		String s2 = String.valueOf(number);
		System.out.println("s2:" + s2);
		// 方式3 int -- Integer --String
		String s3 = new Integer(number).toString();
		System.out.println("s3:" + s3);
		// 方式4
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);

		System.out.println("----------------------");
		// String -- int
		String s = "200";
		// 方式1 String -- Integer -- int
		Integer i = new Integer(s);
		int x = i.intValue();
		System.out.println("x:" + x);
		// 方式二(推荐)
		int x2 = Integer.parseInt(s);
		System.out.println("x2:" + x2);

	}
}
