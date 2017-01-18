package com.pauu.javase.object2;

import java.util.Date;

public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("刘德华",39);
		Student s2 = new Student("刘德华",39);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		Date d = new Date();
		System.out.println(s1.equals(d));
		Object obj = s1.clone();
		Student s3 = (Student) obj;
		System.out.println(s3);
	}
}
