package cn.pauu.javase.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest7 {
	public static void main(String[] args) {
		String str = "jin tian yao xia yu,wan shang bu shang wan zi xi,gao xing bu?";
		String regex = "\\b\\w{3}\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
