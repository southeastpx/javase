package cn.pauu.javase.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 需求：键盘录入5个学生信息，总分排序后存入到文本文件中
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
			System.out.println("请输入第" + x + "个学生信息");
			System.out.println("请输入学生姓名：");
			String name = sc.nextLine();
			System.out.println("请输入语文成绩：");
			int chinese = sc.nextInt();
			System.out.println("请输入数学成绩：");
			int math = sc.nextInt();
			System.out.println("请输入英语成绩：");
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
			bw.write("学生信息如下：");
			bw.newLine();
			bw.flush();
			bw.write("姓名,语文成绩,数学成绩,英语成绩");
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
