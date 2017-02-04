package com.pauu.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) throws ParseException {
		//Date ---> String ����ʽ����
		Date d = new Date();
		//SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println("--------------");
		//String ---> Date (����)
		String str = "2008-08-08 12:12:12";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dd = sdf2.parse(str);
		System.out.println(dd);
	}
}
