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
		System.out.println("键盘录入开始!");
		for (int i = 1; i <= 5; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入第" + i + "个学生的姓名：");
			String name = scanner.nextLine();
			System.out.println("请输入第"+i+"个学生的语文成绩");
			int chinese = scanner.nextInt();
			System.out.println("请输入第"+i+"个学生的数学成绩");
			int math = scanner.nextInt();
			System.out.println("请输入第"+i+"个学生的英语成绩");
			int english = scanner.nextInt();
			
			Teacher teacher = new Teacher();
			teacher.setName(name);
			teacher.setChinese(chinese);
			teacher.setMath(math);
			teacher.setEnglish(english);
			
			treeSet.add(teacher);
		}
		System.out.println("键盘录入结束！");
		System.out.println("总分从高到低输出学生信息");
		System.out.println("学生姓名\t语文成绩\t数学成绩\t英语成绩");
		for(Teacher teacher:treeSet){
			System.out.println(teacher.getName()+"\t"+teacher.getChinese()+"\t"+teacher.getMath()+"\t"+teacher.getEnglish());
		}
	}
}
