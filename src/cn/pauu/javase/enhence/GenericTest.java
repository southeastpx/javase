package cn.pauu.javase.enhence;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class GenericTest {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("zxx", 28);
		hashMap.put("lhm", 35);
		hashMap.put("flx", 33);
		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
		for(Entry<String,Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"µÄÄêÁäÎª£º"+value);
		}
	}
}
