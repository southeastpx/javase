package com.pauu.javase.test;

public class ArgsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a:" + a + ",b:" + b);
		change(a, b);
		System.out.println("a:" + a + ",b:" + b);
		int[] arr = { 1, 2, 3, 4, 5 };
		change(arr);
		System.out.println(arr[1]);
	}

	private static void change(int[] arr) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				arr[i] = arr[i]*2;
			}
		}
	}

	private static void change(int a, int b) {
		System.out.println("a:" + a + ",b:" + b);
		a = b;
		b = a + b;
		System.out.println("a:" + a + ",b:" + b);
	}
}
