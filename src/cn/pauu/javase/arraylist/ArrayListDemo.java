package cn.pauu.javase.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add("world");
		al.add("java");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("-----------");
		for (int i = 0; i < al.size(); i++) {
			String s = (String) al.get(i);
			System.out.println(s);
		}
	}
}
