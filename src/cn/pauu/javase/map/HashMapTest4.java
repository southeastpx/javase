package cn.pauu.javase.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest4 {
	public static void main(String[] args) {
		HashMap<String, HashMap<String, ArrayList<Teacher>>> czboMap = new HashMap<String, HashMap<String, ArrayList<Teacher>>>();
		HashMap<String, ArrayList<Teacher>> bjCzboMap = new HashMap<String, ArrayList<Teacher>>();
		ArrayList<Teacher> arrayList1 = new ArrayList<Teacher>();
		Teacher s1 = new Teacher("�˿�", 27);
		Teacher s2 = new Teacher("����", 29);
		arrayList1.add(s1);
		arrayList1.add(s2);
		bjCzboMap.put("������", arrayList1);
		ArrayList<Teacher> arrayList2 = new ArrayList<Teacher>();
		Teacher s3 = new Teacher("�Ʊ�", 24);
		Teacher s4 = new Teacher("������", 32);
		arrayList2.add(s3);
		arrayList2.add(s4);
		bjCzboMap.put("��ҵ��", arrayList2);
		czboMap.put("����У��", bjCzboMap);

		HashMap<String, ArrayList<Teacher>> xaCzboMap = new HashMap<String, ArrayList<Teacher>>();
		ArrayList<Teacher> arrayList3 = new ArrayList<Teacher>();
		Teacher s5 = new Teacher("����", 21);
		Teacher s6 = new Teacher("���", 23);
		arrayList3.add(s5);
		arrayList3.add(s6);
		xaCzboMap.put("������", arrayList3);
		ArrayList<Teacher> arrayList4 = new ArrayList<Teacher>();
		Teacher s7 = new Teacher("ղķ˹", 29);
		Teacher s8 = new Teacher("ŷ��", 38);
		arrayList4.add(s7);
		arrayList4.add(s8);
		xaCzboMap.put("��ҵ��", arrayList4);
		czboMap.put("����У��", xaCzboMap);

		Set<String> czboMapKeySet = czboMap.keySet();
		for (String czboMapKey : czboMapKeySet) {
			System.out.println(czboMapKey);
			HashMap<String, ArrayList<Teacher>> czboMapValue = czboMap.get(czboMapKey);
			Set<String> czboMapValueKeySet = czboMapValue.keySet();
			for (String czboMapValueKey : czboMapValueKeySet) {
				System.out.println("\t" + czboMapValueKey);
				ArrayList<Teacher> arrayList = czboMapValue.get(czboMapValueKey);
				for (Teacher teacher : arrayList) {
					System.out.println("\t\t" + teacher.getName() + "---" + teacher.getAge());
				}
			}
		}
	}
}
