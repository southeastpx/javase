package cn.pauu.javase.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest3 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		Student s1 = new Student("���»�", 35);
		Student s2 = new Student("�˿�", 21);
		Student s3 = new Student("����", 25);
		Student s4 = new Student("��ŵ����", 38);
		Student s5 = new Student("�Ʊ�", 25);
		Student s6 = new Student("���»�", 35);
		Student s7 = new Student("¡��", 31);
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		arrayList.add(s4);
		arrayList.add(s5);
		arrayList.add(s6);
		arrayList.add(s7);

		ArrayList newArrayList = new ArrayList();

		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Student stu = (Student) iterator.next();
			if (!newArrayList.contains(stu)) {
				newArrayList.add(stu);
			}
		}

		for (Object obj : newArrayList) {
			Student s = (Student) obj;
			System.out.println(s.getName() + "----" + s.getAge());
		}
	}
}
