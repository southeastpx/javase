package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		Collection c2 = new ArrayList();
		// c2.add("abc1");
		// c2.add("abc2");
		// c2.add("abc3");
		// c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");

		// System.out.println("addAll:" + c1.addAll(c2));
		// System.out.println("removeAll:" + c1.removeAll(c2));
		// System.out.println("containAll:" + c1.containsAll(c2));
		System.out.println("retainAll:" + c1.retainAll(c2));//返回值指的是调用的集合是否发生过改变
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
	}
}
