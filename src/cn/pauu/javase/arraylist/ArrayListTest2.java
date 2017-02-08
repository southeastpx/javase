package cn.pauu.javase.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("java");
		arrayList.add("java");
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("world");
		arrayList.add("world");
		arrayList.add("world");
		arrayList.add("hello");
		arrayList.add("world");

		for (int i = 0; i < arrayList.size() - 1; i++) {
			for (int j = i + 1; j < arrayList.size(); j++) {
				if(arrayList.get(i).equals(arrayList.get(j))){
					arrayList.remove(j);
					j--;
				}
			}
		}
		
		Iterator iterator = arrayList.iterator();
		while(iterator.hasNext()){
			String s = (String) iterator.next();
			System.out.println(s);
		}
	}
}
