package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo5 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Student s1 = new Student("���»�",39);
		Student s2 = new Student("Ҧ��",36);
		Student s3 = new Student("�˿�",21);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Object obj : list){
			Student stu = (Student) obj;
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
	}
}
