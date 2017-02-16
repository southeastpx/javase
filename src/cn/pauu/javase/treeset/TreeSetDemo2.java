package cn.pauu.javase.treeset;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		Student s1 = new Student("liuyifei", 23);
		Student s2 = new Student("fengqingyang", 25);
		Student s3 = new Student("yangmi", 23);
		Student s4 = new Student("liuyifei", 23);
		Student s5 = new Student("zhaoyazhi", 29);
		Student s6 = new Student("wuxiaolin", 36);
		Student s7 = new Student("qingqing", 13);
		treeSet.add(s1);
		treeSet.add(s2);
		treeSet.add(s3);
		treeSet.add(s4);
		treeSet.add(s5);
		treeSet.add(s6);
		treeSet.add(s7);

		for (Student s : treeSet) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
