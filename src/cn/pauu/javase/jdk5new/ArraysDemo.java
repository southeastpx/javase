package cn.pauu.javase.jdk5new;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	public static void main(String[] args) {
		// String[] arrString = {"hello","world","java"};
		int[] arrInt = { 1, 2, 3 };
		// Integer[] arrInt = {1,2,3};
		List<int[]> list = Arrays.asList(arrInt);
		// UnsupportedOperationException,���ʻ���һ�����飬���ܸı�����ĳ���
		// list.add("andriod");
		// UnsupportedOperationException,���ʻ���һ�����飬���ܸı�����ĳ���
		// list.remove(1);
		// for(Integer s:list){
		// System.out.println(s);
		// }
		for (int[] s : list) {
			for (int x : s) {
				System.out.println(x);
			}
		}
	}
}
