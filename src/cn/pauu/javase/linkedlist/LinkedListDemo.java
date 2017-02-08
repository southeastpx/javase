package cn.pauu.javase.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
		//linkedList.addFirst("android");
		//linkedList.addLast("javaee");
		System.out.println("getFirst:"+linkedList.getFirst());
		System.out.println("getLast:"+linkedList.getLast());
		System.out.println("removeFirst:"+linkedList.removeFirst());
		System.out.println("removeLast:"+linkedList.removeLast());
		System.out.println(linkedList);
	}
}
