package cn.pauu.javase.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("µË³¬", "ËïÙ³");
		map.put("»ÆÏşÃ÷", "ÑîÓ±");
		map.put("ÁõâıÍş", "ÑîÃİ");
		map.put("ÖÜ½ÜÂ×", "À¥Áè");

		System.out.println("get:" + map.get("»ÆÏşÃ÷"));
		System.out.println("get:" + map.get("»ÆÏş²¨"));

		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}

		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
	}
}
