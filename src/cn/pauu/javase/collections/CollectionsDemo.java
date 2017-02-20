package cn.pauu.javase.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		System.out.println(list);
		// Collections.sort(list);
		// System.out.println(list);
		// System.out.println(Collections.binarySearch(list, 30));
		// System.out.println(Collections.binarySearch(list, 300));
		// System.out.println("max:" + Collections.max(list));
		// Collections.reverse(list);
		// System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
}
