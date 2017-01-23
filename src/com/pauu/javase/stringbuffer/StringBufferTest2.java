package com.pauu.javase.stringbuffer;

public class StringBufferTest2 {
	public static void main(String[] args) {
		int[] arr = { 22, 33, 55, 44, 11 };
		String s= arrayToString(arr);
		System.out.println(s);
	}

	private static String arrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i]).append(" ,");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
