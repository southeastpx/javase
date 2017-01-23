package com.pauu.javase.stringbuffer;

public class StringBufferTest4 {
	public static void main(String[] args) {
		String s = "abcb";
		boolean flag = isBalancedString(s);
		System.out.println("isBalanced:"+flag);
	}

	private static boolean isBalancedString(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}
}
