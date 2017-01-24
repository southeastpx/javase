package com.pauu.javase.array;

import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {
		String s = "dfscabtwop";
		String newStr= stringSort(s);
		System.out.println("≈≈–Ú∫Û:"+newStr);
	}

	private static String stringSort(String s) {
		char[] chs = s.toCharArray();
		Arrays.sort(chs);
		return new String(chs);
	}
}
