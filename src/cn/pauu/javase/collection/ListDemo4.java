package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		for(int i=0;i<list.size();i++){
			String s = (String) list.get(i);
			System.out.println(s);
		}
	}
}
