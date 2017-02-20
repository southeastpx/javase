package cn.pauu.javase.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest2 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("吕布");
		array1.add("周瑜");
		hashMap.put("三国演义", array1);
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("杨过");
		array2.add("林平之");
		hashMap.put("神雕侠侣", array2);
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("孙悟空");
		array3.add("猪八戒");
		hashMap.put("西游记", array3);

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
