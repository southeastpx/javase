package com.pauu.javase.array;

public class HalfFind {
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77 };
		int index = halfFind(arr, 32);
		System.out.println("index:" + index);
	}

	private static int halfFind(int[] arr, int num) {
		int index = -1;
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while (min <= max) {
			if (num < arr[mid]) {
				max = mid - 1;
				mid = (min + max) / 2;
			} else if (num > arr[mid]) {
				min = mid + 1;
				mid = (min + max) / 2;
			} else {
				index = mid;
				break;
			}
		}
		return index;
	}
}
