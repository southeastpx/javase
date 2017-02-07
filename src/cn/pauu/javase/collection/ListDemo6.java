package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo6 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		// 并发修改异常--->迭代器迭代时，不允许集合修改
		// Iterator it = list.iterator();
		// while(it.hasNext()){
		// String s = (String) it.next();
		// if("world".equals(s)){
		// list.add("javaee");
		// }
		// }
		// 方法一：迭代器迭代，迭代器修改
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			if ("world".equals(s)) {
				lit.add("javaee");
			}
		}
		System.out.println("list:" + list);
		System.out.println("-----------");

		// 方法二：普通for遍历集合,集合修改
		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			if("world".equals(s)){
				list.add("android");
			}
		}
		System.out.println("list:" + list);
	}
}
