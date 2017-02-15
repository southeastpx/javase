package cn.pauu.javase.set;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet是HashSet的一个子类，它比较特殊，底层数据结构由链表和哈希表组成，
 * 链表确保了有序(存储和取出顺序一致)，哈希表确保了元素的唯一性
 */
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("hello");
		linkedHashSet.add("world");
		linkedHashSet.add("java");
		linkedHashSet.add("world");
		linkedHashSet.add("java");
		for(String s : linkedHashSet){
			System.out.println(s);
		}
	}
}
