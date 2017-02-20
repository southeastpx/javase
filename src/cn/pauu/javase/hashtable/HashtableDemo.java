package cn.pauu.javase.hashtable;

import java.util.Hashtable;

/*
 * HashMap:�̲߳�ͬ����Ч�ʸߣ�����null��nullֵ
 * Hashtable:�߳�ͬ����Ч�ʵͣ�������null��nullֵ
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
