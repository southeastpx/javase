package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		Object[] objs = c.toArray();
		for(int i=0;i<objs.length;i++){
			Object obj = objs[i];
			System.out.println(obj);
		}
	}
}
