package cn.pauu.javase.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo6 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		// �����޸��쳣--->����������ʱ�����������޸�
		// Iterator it = list.iterator();
		// while(it.hasNext()){
		// String s = (String) it.next();
		// if("world".equals(s)){
		// list.add("javaee");
		// }
		// }
		// ����һ���������������������޸�
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String s = (String) lit.next();
			if ("world".equals(s)) {
				lit.add("javaee");
			}
		}
		System.out.println("list:" + list);
		System.out.println("-----------");

		// ����������ͨfor��������,�����޸�
		for (int x = 0; x < list.size(); x++) {
			String s = (String) list.get(x);
			if("world".equals(s)){
				list.add("android");
			}
		}
		System.out.println("list:" + list);
	}
}
