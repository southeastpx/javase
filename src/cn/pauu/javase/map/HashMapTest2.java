package cn.pauu.javase.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("����");
		array1.add("���");
		hashMap.put("��������", array1);
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("���");
		array2.add("��ƽ֮");
		hashMap.put("�������", array2);
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("�����");
		array3.add("��˽�");
		hashMap.put("���μ�", array3);

		Set<String> keySet = hashMap.keySet();
		for (String key : keySet) {
			System.out.println(key);
			ArrayList<String> value = hashMap.get(key);
			for (String s : value) {
				System.out.println("\t" + s);
			}
		}
	}
}
