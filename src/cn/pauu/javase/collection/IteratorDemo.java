package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		Iterator it = c.iterator();
		while(it.hasNext()){
			String s = (String) it.next();
			System.out.println(s);
		}
	}
}
