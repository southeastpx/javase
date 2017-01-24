package com.pauu.javase.array;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = {13,57,43,32,46};
		System.out.println("排序前:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("排序后:"+Arrays.toString(arr));
		System.out.println("二分查找:"+Arrays.binarySearch(arr, 466));
	}
}
