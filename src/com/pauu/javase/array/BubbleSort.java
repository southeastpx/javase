package com.pauu.javase.array;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 23, 65, 32, 36, 42, 83, 21, 18, 43 };
		printArr(arr);
		// bubbleSort(arr);
		selectSort(arr);
		printArr(arr);
	}

	private static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] > arr[j + 1]) {
					int tmp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	private static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
