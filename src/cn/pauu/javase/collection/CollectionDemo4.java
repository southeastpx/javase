package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("���»�", 30);
		Student s2 = new Student("����ϼ", 45);
		Student s3 = new Student("�˿�", 38);
		Student s4 = new Student("����", 27);
		Student s5 = new Student("�Ʊ�", 36);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		Iterator it = c.iterator();
		while (it.hasNext()) {
			Student s = (Student) it.next();
			System.out.println(s.getName() + "---" + s.getAge());
		}
		//forѭ���Ľ�
		// for(Iterator it = c.iterator();it.hasNext();){
		// Student s = (Student) it.next();
		// System.out.println(s.getName()+"---"+s.getAge());
		// }
	}
}
