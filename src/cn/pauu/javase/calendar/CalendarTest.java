package cn.pauu.javase.calendar;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �����ж�����һ����ݵ�2���ж�����
 */
public class CalendarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����:");
		int year = sc.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);//�����ݵ�3��1��
		c.add(Calendar.DATE, -1);
		System.out.println(c.get(Calendar.DATE));
	}
}
