package cn.pauu.javase.treeset;

import java.util.TreeSet;

/*
 * TreeSet特点：排序（自然顺序，比较器顺序），唯一
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(19);
		treeSet.add(21);
		treeSet.add(19);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(19);
		treeSet.add(16);
		treeSet.add(21);
		treeSet.add(23);
		for(Integer i : treeSet){
			System.out.println(i);
		}
	}
}
