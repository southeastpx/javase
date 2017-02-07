package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("���»�",50);
		Student s2 = new Student("������",25);
		Student s3 = new Student("Ҧ��",36);
		Student s4 = new Student();
		s4.setName("����");
		s4.setAge(30);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(new Student("�Ʊ�",35));
		Iterator it = c.iterator();
		while(it.hasNext()){
			Student stu = (Student) it.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
	}
}
