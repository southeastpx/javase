package cn.pauu.javase.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * ���󣺱����������
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "���java";
		//����   String --> byte[]
		byte[] bys = s.getBytes("UTF-8");
		System.out.println(Arrays.toString(bys));
		//����  byte[] --> String
		String ss = new String(bys,"UTF-8");
		System.out.println(ss);
	}
}
