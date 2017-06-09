package cn.pauu.javase.enhence;

import java.lang.reflect.Constructor;

public class ReflectTest {
	public static void main(String[] args) throws Exception {
		String str = "abc";
		Class cls1 = str.getClass();
		Class cls2 = String.class;
		Class cls3 = Class.forName("java.lang.String");
		System.out.println(cls1 == cls2);// true
		System.out.println(cls1 == cls3);// true
		System.out.println(cls1.isPrimitive());// false
		System.out.println(int.class.isPrimitive());// true
		System.out.println(Integer.class.isPrimitive());// false
		System.out.println(int.class == Integer.class);// false
		System.out.println(int.class == Integer.TYPE);// true
		System.out.println(int[].class.isPrimitive());// false
		System.out.println(int[].class.isArray());// true
		
		Constructor constructor = String.class.getConstructor(StringBuffer.class);
		String str2 = (String) constructor.newInstance(new StringBuffer("abc"));
		System.out.println(str2.charAt(2));
	}
}
