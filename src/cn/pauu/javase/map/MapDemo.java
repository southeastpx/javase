package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		// System.out.println(map.put("����", "�����P"));
		// System.out.println(map.put("����", "Ҧ��"));
		map.put("�˳�", "��ٳ");
		map.put("������", "��ӱ");
		map.put("������", "����");
		map.put("�ܽ���", "����");
		// map.clear();
		// System.out.println(map.remove("������"));
		// System.out.println(map.remove("������"));
		System.out.println("containsKey:" + map.containsKey("������"));
		System.out.println("containsKey:" + map.containsKey("������"));
		System.out.println("containsValue:" + map.containsValue("����"));
		System.out.println("containsValue:" + map.containsValue("������"));
		System.out.println("isEmpty:" + map.isEmpty());

		System.out.println("map:" + map);
	}
}
