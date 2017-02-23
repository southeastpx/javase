package cn.pauu.javase.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			method();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static void method() throws ParseException{
		String str = "2014-07-09";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(str);
		System.out.println(d);
	}
}
