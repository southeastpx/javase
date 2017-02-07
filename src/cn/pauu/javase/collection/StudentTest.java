package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("刘德华", 30);
		Student s2 = new Student("林青霞", 45);
		Student s3 = new Student("邓肯", 38);
		Student s4 = new Student("帕克", 27);
		Student s5 = new Student("科比", 36);
		Collection c = new ArrayList();
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		Object[] objs = c.toArray();
		for (Object obj : objs) {
			Student stu = (Student) obj;
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}
}
