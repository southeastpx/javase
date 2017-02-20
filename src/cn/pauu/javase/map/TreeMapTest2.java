package cn.pauu.javase.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest2 {
	public static void main(String[] args) {
		Map<Person, String> treeMap = new TreeMap<Person, String>();
		Person p1 = new Person("dengken", 27);
		Person p2 = new Person("liuxiang", 29);
		Person p3 = new Person("yaoming", 28);
		Person p4 = new Person("pake", 22);
		Person p5 = new Person("dengken", 23);
		Person p6 = new Person("linqingxia", 26);
		Person p7 = new Person("liuxiang", 29);
		treeMap.put(p1, "it001");
		treeMap.put(p2, "it002");
		treeMap.put(p3, "it003");
		treeMap.put(p4, "it004");
		treeMap.put(p5, "it005");
		treeMap.put(p6, "it006");
		treeMap.put(p7, "it007");

		Set<Map.Entry<Person, String>> entrySet = treeMap.entrySet();
		for (Map.Entry<Person, String> entry : entrySet) {
			Person per = entry.getKey();
			String value = entry.getValue();
			System.out.println(per.getName() + "----" + per.getAge() + "---" + value);
		}
	}
}
