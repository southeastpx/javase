package cn.pauu.javase.integer;

public class IntegerTest {
	public static void main(String[] args) {
		// int -- String
		int number = 100;
		// ��ʽ1
		String s1 = "" + 100;
		System.out.println("s1:" + s1);
		// ��ʽ2(�Ƽ�)
		String s2 = String.valueOf(number);
		System.out.println("s2:" + s2);
		// ��ʽ3 int -- Integer --String
		String s3 = new Integer(number).toString();
		System.out.println("s3:" + s3);
		// ��ʽ4
		String s4 = Integer.toString(number);
		System.out.println("s4:" + s4);

		System.out.println("----------------------");
		// String -- int
		String s = "200";
		// ��ʽ1 String -- Integer -- int
		Integer i = new Integer(s);
		int x = i.intValue();
		System.out.println("x:" + x);
		// ��ʽ��(�Ƽ�)
		int x2 = Integer.parseInt(s);
		System.out.println("x2:" + x2);

	}
}
