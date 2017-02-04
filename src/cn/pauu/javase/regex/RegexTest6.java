package cn.pauu.javase.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest6 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaaab");
		boolean b = m.matches();
		System.out.println("matcher:"+b);
	}
}
