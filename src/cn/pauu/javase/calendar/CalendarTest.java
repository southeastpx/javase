package cn.pauu.javase.calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 需求：判断任意一个年份的2月有多少天
 */
public class CalendarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份:");
		int year = sc.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);//这个年份的3月1日
		c.add(Calendar.DATE, -1);
		System.out.println(c.get(Calendar.DATE));
	}
}
