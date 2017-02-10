package cn.pauu.javase.jdk5new;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Student> arrayList1 = new ArrayList<Student>();
		Student s1 = new Student("��ɮ",30);
		Student s2 = new Student("�����",28);
		Student s3 = new Student("��˽�",35);
		arrayList1.add(s1);
		arrayList1.add(s2);
		arrayList1.add(s3);
		
		ArrayList<Student> arrayList2 = new ArrayList<Student>();
		Student s4 = new Student("�ŷ�",29);
		Student s5= new Student("����",37);
		Student s6 = new Student("�ܲ�",20);
		arrayList2.add(s4);
		arrayList2.add(s5);
		arrayList2.add(s6);
		
		ArrayList<Student> arrayList3 = new ArrayList<Student>();
		Student s7 = new Student("�˿�",21);
		Student s8= new Student("����",33);
		Student s9 = new Student("�Ʊ�",36);
		arrayList3.add(s7);
		arrayList3.add(s8);
		arrayList3.add(s9);
		
		ArrayList<ArrayList<Student>> all = new ArrayList<ArrayList<Student>>();
		all.add(arrayList1);
		all.add(arrayList2);
		all.add(arrayList3);
		
		Iterator<ArrayList<Student>> iterator = all.iterator();
		while(iterator.hasNext()){
			ArrayList<Student> arrayList = iterator.next();
			for(Student stu : arrayList){
				System.out.println(stu.getName()+"---"+stu.getAge());
			}
		}
	}
}
