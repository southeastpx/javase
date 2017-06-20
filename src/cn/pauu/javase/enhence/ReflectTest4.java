package cn.pauu.javase.enhence;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReflectTest4 {
	public static void main(String[] args) {
		// 数组的维度相同，元素类型相同，就持有同一份字节码
		int[] a1 = new int[] { 1, 2, 3 };
		int[] a2 = new int[4];
		int[][] a3 = new int[2][3];
		String[] a4 = new String[] { "a", "b", "c" };
		System.out.println(a1.getClass() == a2.getClass());// true
		// System.out.println(a1.getClass() == a3.getClass());
		// System.out.println(a1.getClass() == a4.getClass());
		System.out.println(a1.getClass().getName());// [I

		// 数组与Object的关系
		System.out.println(a1.getClass().getSuperclass().getName());// java.lang.Object
		System.out.println(a4.getClass().getSuperclass().getName());// java.lang.Object
		Object aObj1 = a1;
		Object aObj2 = a3;
		Object aObj3 = a4;
		// Object[] aObj4 = a1;//编译器报错
		Object[] aObj5 = a3;
		Object[] aObj6 = a4;
		System.out.println(a1);// [I@b9e45a
		System.out.println(a4);// [Ljava.lang.String;@3ef810
		System.out.println(Arrays.asList(a1));// [[I@b9e45a]
		System.out.println(Arrays.asList(a4));// [a, b, c]

		printObject(a1);
		printObject("abcde");
	}

	private static void printObject(Object obj) {
		Class clazz = obj.getClass();
		if (clazz.isArray()) {
			int length = Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				System.out.println(Array.get(obj, i));
			}
		} else {
			System.out.println(obj);
		}
	}
}
