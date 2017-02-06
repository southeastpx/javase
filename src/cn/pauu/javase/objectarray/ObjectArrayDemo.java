package cn.pauu.javase.objectarray;

public class ObjectArrayDemo {
	public static void main(String[] args) {
		Student[] students = new Student[5];
		Student s1 = new Student("���»�", 35);
		Student s2 = new Student("������", 55);
		Student s3 = new Student("����", 28);
		Student s4 = new Student("÷��", 29);
		Student s5 = new Student("�˿�", 38);
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		for (int i = 0; i < students.length; i++) {
			//System.out.println(students[i]);
			Student s = students[i];
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}
}
