package cn.pauu.javase.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * 需求:按姓名长度存储自定义元素到TreeSet
 */
public class TreeSetDemo3 {
	public static void main(String[] args) {
		// TreeSet<Person> treeSet = new TreeSet<Person>(new MyComparator());
		TreeSet<Person> treeSet = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				int num1 = p1.getName().length() - p2.getName().length();
				int num2 = num1 == 0 ? (p1.getName().equals(p2.getName()) == true ? 0 : 1) : num1;
				int num3 = num2 == 0 ? p1.getAge() - p2.getAge() : num2;
				return num3;
			}

		});
		Person p1 = new Person("liqingxia", 29);
		Person p2 = new Person("wanglihong", 30);
		Person p3 = new Person("wuminxia", 22);
		Person p4 = new Person("liqingxia", 29);
		Person p5 = new Person("liudehua", 23);
		Person p6 = new Person("liqingxia", 26);
		Person p7 = new Person("zhanmusi", 31);
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		treeSet.add(p5);
		treeSet.add(p6);
		treeSet.add(p7);

		for (Person person : treeSet) {
			System.out.println(person.getName() + "---" + person.getAge());
		}
	}
}
