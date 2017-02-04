package com.pauu.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是日期和字符串相互转换的工具类
 * 
 * @author peng.xing
 * @version 1.0
 */
public class DateUtil {
	private DateUtil() {
	}

	/**
	 * 该方法的作用是日期转换为指定格式的字符串
	 * @param date 被转换的日期
	 * @param pattern 指定的格式
	 * @return 日期按照指定格式转换后返回的字符串
	 */
	public static String dateToString(Date date,String pattern){
		return new SimpleDateFormat(pattern).format(date);
	}
	
	/**
	 * 该方法的作用是字符串转换为指定格式的日期
	 * @param str 被转换的字符串
	 * @param pattern 指定的格式
	 * @return 字符串按照指定格式转换后返回的日期
	 * @throws ParseException
	 */
	public static Date stringToDate(String str,String pattern) throws ParseException{
		return new SimpleDateFormat(pattern).parse(str);
	}
}
