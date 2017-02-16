package cn.pauu.javase.treeset;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int num1 = p1.getName().length() - p2.getName().length();
		int num2 = num1 == 0 ? (p1.getName().equals(p2.getName())==true?0:1) : num1;
		int num3 = num2 == 0 ? p1.getAge() - p2.getAge() : num2;
		return num3;
	}

}
