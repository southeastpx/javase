package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Student s1 = new Student("刘德华",50);
		Student s2 = new Student("孙燕姿",25);
		Student s3 = new Student("姚明",36);
		Student s4 = new Student();
		s4.setName("李娜");
		s4.setAge(30);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(new Student("科比",35));
		Iterator it = c.iterator();
		while(it.hasNext()){
			Student stu = (Student) it.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
	}
}
