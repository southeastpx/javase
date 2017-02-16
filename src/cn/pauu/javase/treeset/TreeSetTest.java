package cn.pauu.javase.treeset;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Teacher> treeSet = new TreeSet<Teacher>(new Comparator<Teacher>() {

			@Override
			public int compare(Teacher t1, Teacher t2) {
				int num = t2.getSum() - t1.getSum();
				int num2 = num == 0 ? t2.getChinese() - t1.getChinese() : num;
				int num3 = num2 == 0 ? t2.getMath() - t1.getMath() : num2;
				int num4 = num3 == 0 ? t2.getEnglish() - t1.getEnglish() : num3;
				int num5 = num4 == 0 ? t2.getName().compareTo(t1.getName()) : num4;
				return num5;
			}
		});
		System.out.println("����¼�뿪ʼ!");
		for (int i = 1; i <= 5; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("�������" + i + "��ѧ����������");
			String name = scanner.nextLine();
			System.out.println("�������"+i+"��ѧ�������ĳɼ�");
			int chinese = scanner.nextInt();
			System.out.println("�������"+i+"��ѧ������ѧ�ɼ�");
			int math = scanner.nextInt();
			System.out.println("�������"+i+"��ѧ����Ӣ��ɼ�");
			int english = scanner.nextInt();
			
			Teacher teacher = new Teacher();
			teacher.setName(name);
			teacher.setChinese(chinese);
			teacher.setMath(math);
			teacher.setEnglish(english);
			
			treeSet.add(teacher);
		}
		System.out.println("����¼�������");
		System.out.println("�ִܷӸߵ������ѧ����Ϣ");
		System.out.println("ѧ������\t���ĳɼ�\t��ѧ�ɼ�\tӢ��ɼ�");
		for(Teacher teacher:treeSet){
			System.out.println(teacher.getName()+"\t"+teacher.getChinese()+"\t"+teacher.getMath()+"\t"+teacher.getEnglish());
		}
	}
}
