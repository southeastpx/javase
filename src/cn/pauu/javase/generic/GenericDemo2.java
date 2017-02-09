package cn.pauu.javase.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo2 {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student s1 = new Student("刘德华", 25);
		Student s2 = new Student("林青霞", 38);
		Student s3 = new Student("周杰伦", 29);
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		Iterator<Student> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Student stu = iterator.next();
			System.out.println(stu.getName() + "---" + stu.getAge());
		}
	}
}
