package cn.pauu.javase.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 需求：编码解码问题
 */
public class StringDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "你好java";
		//编码   String --> byte[]
		byte[] bys = s.getBytes("UTF-8");
		System.out.println(Arrays.toString(bys));
		//解码  byte[] --> String
		String ss = new String(bys,"UTF-8");
		System.out.println(ss);
	}
}
