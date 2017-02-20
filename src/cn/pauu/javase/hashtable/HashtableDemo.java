package cn.pauu.javase.hashtable;

import java.util.Hashtable;

/*
 * HashMap:线程不同步，效率高，允许null键null值
 * Hashtable:线程同步，效率低，不允许null键null值
 */
public class HashtableDemo {
	public static void main(String[] args) {
		// HashMap<String, String> hm = new HashMap<String, String>();
		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("it001", "java");
		hm.put(null, "php");
		hm.put("it002", null);
		System.out.println(hm);
	}
}
