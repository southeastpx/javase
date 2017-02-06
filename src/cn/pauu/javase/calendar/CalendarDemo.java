package cn.pauu.javase.calendar;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int hour = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int sec = rightNow.get(Calendar.SECOND);
		System.out.println(year + "��" + (month + 1) + "��" + day + "��" + " " + hour + ":" + min + ":" + sec);
		// 3��ǰ�Ľ���
		rightNow.add(Calendar.YEAR, -3);
		year = rightNow.get(Calendar.YEAR);
		month = rightNow.get(Calendar.MONTH);
		day = rightNow.get(Calendar.DAY_OF_MONTH);
		hour = rightNow.get(Calendar.HOUR);
		min = rightNow.get(Calendar.MINUTE);
		sec = rightNow.get(Calendar.SECOND);
		System.out.println(year + "��" + (month + 1) + "��" + day + "��" + " " + hour + ":" + min + ":" + sec);
		// 5����10��ǰ
		rightNow.add(Calendar.YEAR, 5);
		rightNow.add(Calendar.DAY_OF_MONTH, -10);
		year = rightNow.get(Calendar.YEAR);
		month = rightNow.get(Calendar.MONTH);
		day = rightNow.get(Calendar.DAY_OF_MONTH);
		hour = rightNow.get(Calendar.HOUR);
		min = rightNow.get(Calendar.MINUTE);
		sec = rightNow.get(Calendar.SECOND);
		System.out.println(year + "��" + (month + 1) + "��" + day + "��" + " " + hour + ":" + min + ":" + sec);
		rightNow.set(2011, 11, 11);
		year = rightNow.get(Calendar.YEAR);
		month = rightNow.get(Calendar.MONTH);
		day = rightNow.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "��" + (month + 1) + "��" + day + "��");
	}
}
