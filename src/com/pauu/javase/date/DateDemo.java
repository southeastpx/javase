package com.pauu.javase.date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		long time = 1000 * 60 * 60;
		Date d2 = new Date(time);//1小时，由于是东八区，显示为9点
		System.out.println(d2);
	}
}
