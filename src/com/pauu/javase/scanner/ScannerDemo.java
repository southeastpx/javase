package com.pauu.javase.scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*while(sc.hasNextInt()){
			int x = sc.nextInt();
			System.out.println("Êý¾ÝÊÇ:"+x);
		}*/
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//		System.out.println("s1:"+s1+",s2:"+s2);
		int x = sc.nextInt();
		String s = sc.nextLine();
		System.out.println("x="+x+",s="+s);
	}
}
