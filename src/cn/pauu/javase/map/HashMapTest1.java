package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {
	public static void main(String[] args) {
		Map<String, HashMap<String, Integer>> czboMap = new HashMap<String, HashMap<String, Integer>>();
		HashMap<String, Integer> jcMap = new HashMap<String, Integer>();
		jcMap.put("邓肯", 29);
		jcMap.put("帕克", 27);
		jcMap.put("科比", 36);
		czboMap.put("jc", jcMap);
		HashMap<String, Integer> jyMap = new HashMap<String, Integer>();
		jyMap.put("梅西", 22);
		jyMap.put("纳尼", 37);
		jyMap.put("罗本", 35);
		czboMap.put("jy", jyMap);
		
		Set<String> keySet = czboMap.keySet();
		for(String key : keySet){
			System.out.println(key);
			HashMap<String,Integer> value = czboMap.get(key);
			Set<String> myKeySet = value.keySet();
			for(String myKey : myKeySet){
				Integer myValue = value.get(myKey);
				System.out.println("\t"+myKey+"---"+myValue);
			}
		}
	}
}
