package cn.pauu.javase.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * ArrayList�洢�Զ����������
 */
public class CollectionsDemo2 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student("���»�", 30);
		Student s2 = new Student("������", 26);
		Student s3 = new Student("����֥", 30);
		Student s4 = new Student("���»�", 30);
		Student s5 = new Student("���㲨", 36);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.getAge() - s2.getAge();
				int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
				return num2;
			}
		});

		for (Student s : list) {
			System.out.println(s.getName() + "---" + s.getAge());
		}
	}
}
