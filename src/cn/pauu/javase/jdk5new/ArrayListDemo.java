package cn.pauu.javase.jdk5new;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		for(String s : arrayList){
			System.out.println(s);
		}
	}
}
