package cn.pauu.javase.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 需求：去除ArrayList中的重复元素
 * 
 * @author peng.xing
 *
 */
public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("world");
		arrayList.add("world");
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		System.out.println(arrayList);
		ArrayList newArrayList = new ArrayList();
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			if (!newArrayList.contains(s)) {
				newArrayList.add(s);
			}
		}
		for (int x = 0; x < newArrayList.size(); x++) {
			String s = (String) newArrayList.get(x);
			System.out.println(s);
		}
	}
}
