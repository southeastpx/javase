package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		// System.out.println("add:"+c.add("hello"));//”¿‘∂∑µªÿtrue
		c.add("hello");
		c.add("world");
		c.add("java");
		// c.clear();
		// System.out.println("remove:" + c.remove("hello"));
		// System.out.println("remove:" + c.remove("javaee"));
		System.out.println("contains:" + c.contains("hello"));
		System.out.println("contains:" + c.contains("andriod"));
		System.out.println("isEmpty:" + c.isEmpty());
		System.out.println("size:" + c.size());
		c.clear();
		System.out.println("isEmpty:" + c.isEmpty());
		System.out.println("c:" + c);
	}
}
