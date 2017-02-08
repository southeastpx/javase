package cn.pauu.javase.linkedlist;

import java.util.LinkedList;

/**
 * ʹ��LinkedListģ��ջ�Ĺ���
 * 
 * @author peng.xing
 * @version V1.0
 */
public class MyStack {
	private LinkedList linkedList;

	public MyStack() {
		linkedList = new LinkedList();
	}

	public void add(Object obj) {
		linkedList.addFirst(obj);
	}

	public Object get() {
		return linkedList.removeFirst();
	}

	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
}
