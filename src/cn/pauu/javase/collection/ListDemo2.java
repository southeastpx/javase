package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Student s1 = new Student("ÁõµÂ»ª",30);
		Student s2 = new Student("ËïÔÃ",35);
		Student s3 = new Student("Ò¦Ã÷",39);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Iterator it = list.iterator();
		while(it.hasNext()){
			Student s = (Student) it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
