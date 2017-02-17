package cn.pauu.javase.treeset;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
/*
 *     Collection
 *         |--List(有序，可以重复)
 *             |--ArrayList
 *             		底层数据结构是数组，查询快，增删慢
 *             		线程不安全，高效
 *             |--LinkedList
 *             		底层数据结构是链表，查询慢，增删快
 *             		线程不安全，高效
 *             |--Vector
 *             		底层数据结构是数组，查询快，增删慢
 *             		线程安全，低效
 *         |--Set(无序，唯一)
 *         	   |--HashSet
 *         			底层数据结构是哈希表（挂着链表的数组）
 *         			保证唯一：通过元素的hashCode()和equals()方法
 *         			|--LinkedHashSet
 *         				底层数据结构是链表和哈希表，链表保证有序，哈希表保证唯一
 *         	   |--TreeSet
 *         			底层数据界都是二叉树。
 *         			排序有两种：①自然排序（元素具有比较性）-->元素类实现Comparable接口，重写compareTo()方法
 *         					  ②比较器排序（集合具有比较性）-->自定义比较器类实现Comparator接口，重写compare()方法
 *         			保证唯一：通过重写方法的返回值是否为0判断
 */
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
			System.out.println("请输入第" + i + "个学生的语文成绩");
			int chinese = scanner.nextInt();
			System.out.println("请输入第" + i + "个学生的数学成绩");
			int math = scanner.nextInt();
			System.out.println("请输入第" + i + "个学生的英语成绩");
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
		for (Teacher teacher : treeSet) {
			System.out.println(teacher.getName() + "\t" + teacher.getChinese() + "\t" + teacher.getMath() + "\t"
					+ teacher.getEnglish());
		}
	}
}
