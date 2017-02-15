package cn.pauu.javase.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("world");
		hashSet.add("java");
		hashSet.add("world");
		hashSet.add("hello");
		for(Iterator<String> iterator = hashSet.iterator();iterator.hasNext();){
			String s = iterator.next();
			System.out.println(s);
		}
	}
}
