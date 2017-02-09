package cn.pauu.javase.jdk5new;

import java.util.ArrayList;

public class HenceForDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// 普通for循环
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("-----------");
		//增强for循环
		for(int x : arr){
			System.out.println(x);
		}
		
		System.out.println("-----------");
		String[] arr1 = {"刘德华","姚明","刘翔"};
		for(String s : arr1){
			System.out.println(s);
		}
		
		System.out.println("-----------");
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		for(String s : list){
			/*if("world".equals(s)){
				list.add("andriod");//存在并发修改异常，增强for其实就是迭代器
			}*/
			System.out.println(s);
		}
	}
}
