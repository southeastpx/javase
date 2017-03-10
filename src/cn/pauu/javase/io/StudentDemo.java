package cn.pauu.javase.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * ���󣺼���¼��5��ѧ����Ϣ���ܷ��������뵽�ı��ļ���
 */
public class StudentDemo {
	public static void main(String[] args) {
		TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s2.getSum() - s1.getSum();
				int num2 = (num == 0) ? s1.getName().compareTo(s2.getName()) : num;
				return num2;
			}
		});
		for (int x = 1; x <= 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������" + x + "��ѧ����Ϣ");
			System.out.println("������ѧ��������");
			String name = sc.nextLine();
			System.out.println("���������ĳɼ���");
			int chinese = sc.nextInt();
			System.out.println("��������ѧ�ɼ���");
			int math = sc.nextInt();
			System.out.println("������Ӣ��ɼ���");
			int english = sc.nextInt();
			Student s = new Student();
			s.setName(name);
			s.setChinese(chinese);
			s.setMath(math);
			s.setEnglish(english);
			treeSet.add(s);
		}
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("stu.txt"));
			bw.write("ѧ����Ϣ���£�");
			bw.newLine();
			bw.flush();
			bw.write("����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
			bw.newLine();
			bw.flush();
			for (Student s : treeSet) {
				StringBuilder sb = new StringBuilder();
				sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",")
						.append(s.getEnglish());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
