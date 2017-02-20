package cn.pauu.javase.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest1 {
	public static void main(String[] args) {
		Map<String,String> treeMap = new TreeMap<String,String>();
		treeMap.put("lingqingxia", "27");
		treeMap.put("yaoming", "29");
		treeMap.put("dengken", "31");
		treeMap.put("pake", "23");
		treeMap.put("jinuobili", "33");
		treeMap.put("yaoming", "29");
		Set<String> keySet = treeMap.keySet();
		for(String key : keySet){
			String value = treeMap.get(key);
			System.out.println(key+"----"+value);
		}
	}
}
