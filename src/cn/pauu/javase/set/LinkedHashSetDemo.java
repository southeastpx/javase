package cn.pauu.javase.set;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet��HashSet��һ�����࣬���Ƚ����⣬�ײ����ݽṹ������͹�ϣ����ɣ�
 * ����ȷ��������(�洢��ȡ��˳��һ��)����ϣ��ȷ����Ԫ�ص�Ψһ��
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
