package cn.pauu.javase.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest3 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> hashMap1 = new HashMap<String, String>();
		hashMap1.put("������", "��ӱ");
		hashMap1.put("�˳�", "��ٳ");
		arrayList.add(hashMap1);
		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		hashMap1.put("��ޱ", "������");
		hashMap1.put("�Ʊ�", "������");
		arrayList.add(hashMap2);
		HashMap<String, String> hashMap3 = new HashMap<String, String>();
		hashMap1.put("������", "������");
		hashMap1.put("��ɮ", "��˽�");
		arrayList.add(hashMap3);
		for (HashMap<String, String> hashMap : arrayList) {
			Set<String> keySet = hashMap.keySet();
			for (String key : keySet) {
				String value = hashMap.get(key);
				System.out.println(key + "---" + value);
			}
		}
	}
}
