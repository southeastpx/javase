package cn.pauu.javase.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()){
			String s = iterator.next();
			System.out.println(s);
		}
	}
}
