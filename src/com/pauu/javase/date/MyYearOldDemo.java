package com.pauu.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyYearOldDemo {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的生日:");
		String line = sc.nextLine();
		Date d = new SimpleDateFormat("yyyy-MM-dd").parse(line);
		long yearTime = d.getTime();
		long nowTime = System.currentTimeMillis();
		long time = nowTime - yearTime;
		long day = time / 1000 / 60 / 60 / 24;
		System.out.println("来到世界：" + day + "天");
	}
}
