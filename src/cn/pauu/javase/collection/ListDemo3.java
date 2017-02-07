package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add(1, "andriod");
		// System.out.prisdntln("get:"+list.get(1));
		// System.out.println("remove:"+list.remove(1));
		System.out.println("set:" + list.set(2, "javaee"));
		System.out.println("list:" + list);
	}
}
