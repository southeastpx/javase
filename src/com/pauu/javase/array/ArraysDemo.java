package com.pauu.javase.array;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = {13,57,43,32,46};
		System.out.println("����ǰ:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("�����:"+Arrays.toString(arr));
		System.out.println("���ֲ���:"+Arrays.binarySearch(arr, 466));
	}
}
