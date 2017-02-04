package com.pauu.javase.date;

import java.util.Date;

public class DateDemo2 {
	public static void main(String[] args) {
		Date d = new Date();
		long time = d.getTime();
		System.out.println(time);
		System.out.println(System.currentTimeMillis());
		System.out.println("---------");
		System.out.println("d:" + d);
		d.setTime(1000);
		System.out.println("d:" + d);
	}
}
