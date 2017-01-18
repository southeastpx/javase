package com.pauu.javase.object;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		Student s3 = s1;
		System.out.println(s3.hashCode());
		System.out.println("------------");
		Student s = new Student();
		String str = s.getClass().getName();
		System.out.println(str);
		System.out.println("------------");
		System.out.println(s.toString());
		System.out.println("--------------");
		System.out.println(s.getClass().getName()+"@"+Integer.toHexString(s.hashCode()));
		System.out.println(s.toString());
		System.out.println(s);
	}
}
