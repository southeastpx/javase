package cn.pauu.javase.jdk5new;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student s1 = new Student("���»�", 35);
		Student s2 = new Student("Ҧ��", 39);
		Student s3 = new Student("�˿�", 28);
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		for (Student stu : arrayList) {
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}
}
