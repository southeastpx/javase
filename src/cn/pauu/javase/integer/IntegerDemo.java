package cn.pauu.javase.integer;

public class IntegerDemo {
	public static void main(String[] args) {
		// System.out.println(Integer.toBinaryString(100));
		// System.out.println(Integer.toOctalString(100));
		// System.out.println(Integer.toHexString(100));
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(Integer.MIN_VALUE);
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println(ii);

		String s = "100";
		// String s = "abc";//NumberFormatException
		Integer iii = new Integer(s);
		System.out.println(iii);
	}
}
