package cn.pauu.javase.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Student s1 = new Student("���»�",35); 
		Student s2 = new Student("�Ʊ�",38); 
		Student s3 = new Student("�˿�",21); 
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator it = al.iterator();
		while(it.hasNext()){
			Student stu = (Student) it.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
	}
}
