package com.pauu.javase.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �������ں��ַ����໥ת���Ĺ�����
 * 
 * @author peng.xing
 * @version 1.0
 */
public class DateUtil {
	private DateUtil() {
	}

	/**
	 * �÷���������������ת��Ϊָ����ʽ���ַ���
	 * @param date ��ת��������
	 * @param pattern ָ���ĸ�ʽ
	 * @return ���ڰ���ָ����ʽת���󷵻ص��ַ���
	 */
	public static String dateToString(Date date,String pattern){
		return new SimpleDateFormat(pattern).format(date);
	}
	
	/**
	 * �÷������������ַ���ת��Ϊָ����ʽ������
	 * @param str ��ת�����ַ���
	 * @param pattern ָ���ĸ�ʽ
	 * @return �ַ�������ָ����ʽת���󷵻ص�����
	 * @throws ParseException
	 */
	public static Date stringToDate(String str,String pattern) throws ParseException{
		return new SimpleDateFormat(pattern).parse(str);
	}
}
