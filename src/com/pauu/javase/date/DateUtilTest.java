package com.pauu.javase.date;

import java.text.ParseException;
import java.util.Date;

public class DateUtilTest {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		String s1 = DateUtil.dateToString(d,"yyyy-MM-dd HH:mm:ss");
		System.out.println(s1);
		String s2 = DateUtil.dateToString(d,"yyyy-MM-dd");
		System.out.println(s2);
		String s3 = DateUtil.dateToString(d,"HH:mm:ss");
		System.out.println(s3);
		System.out.println("------------");
		String str = "2009-08-09 12:11:11";
		Date dd = DateUtil.stringToDate(str,"yyyy-MM-dd HH:mm:ss");
		System.out.println(dd);
	}
}
