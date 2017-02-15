package cn.pauu.javase.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		Student s1 = new Student("刘德华",30);
		Student s2 = new Student("姚明",35);
		Student s3 = new Student("邓肯",38);
		Student s4 = new Student("科比",36);
		Student s5 = new Student("刘德华",30);
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		hashSet.add(s4);
		hashSet.add(s5);
		Iterator<Student> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			Student stu = iterator.next();
			System.out.println(stu.getName()+"---"+stu.getAge());
		}
	}
}
 