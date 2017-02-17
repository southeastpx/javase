package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 需求：HashMap<String,String>
 */
public class MapTest1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("it001", "马云");
		map.put("it003", "雷军");
		map.put("it005", "丁磊");
		map.put("it004", "马化腾");
		map.put("it002", "张朝阳");
		map.put("it001", "张小龙");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
