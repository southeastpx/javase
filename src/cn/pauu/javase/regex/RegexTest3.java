package cn.pauu.javase.regex;

import java.util.Scanner;

public class RegexTest3 {
	public static void main(String[] args) {
		String ageScope = "18-24";
		String regex = "-";
		String[] ageArray = ageScope.split(regex);
		int startAge = Integer.parseInt(ageArray[0]);
		int endAge = Integer.parseInt(ageArray[1]);
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:");
		int age = sc.nextInt();
		if(age>=startAge && age<=endAge){
			System.out.println("����Ҫ��");
		}else{
			System.out.println("������Ҫ��,gun!");
		}
	}
}
