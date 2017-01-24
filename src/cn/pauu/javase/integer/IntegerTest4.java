package cn.pauu.javase.integer;

public class IntegerTest4 {
	public static void main(String[] args) {
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);//false
		System.out.println(i1.equals(i2));//true
		System.out.println("-------------------");
		Integer i3 = 127;//´æÔÚ×Ö·û´®»º³å³Ø
		Integer i4 = 127;
		System.out.println(i3 == i4);//true
		System.out.println(i3.equals(i4));//true
		System.out.println("--------------------");
		Integer i5 = new Integer(128);
		Integer i6 = new Integer(128);
		System.out.println(i5 == i6);//false
		System.out.println(i5.equals(i6));//true
		System.out.println("-------------------");
		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7 == i8);//false
		System.out.println(i7.equals(i8));//true
	}
}
