package cn.pauu.javase.regex;

public class RegexTest5 {
	public static void main(String[] args) {
		String str = "hello124324world43240java";
		String regex = "\\d";
		String replacement = "*";
		String result = str.replaceAll(regex, replacement);
		System.out.println("result:"+result);
	}
}
