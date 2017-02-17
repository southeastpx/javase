package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * mapµü´ú·½Ê½¶ş
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("µË³¬", "ËïÙ³");
		map.put("»ÆÏşÃ÷", "ÑîÓ±");
		map.put("ÁõâıÍş", "ÑîÃİ");
		map.put("ÖÜ½ÜÂ×", "À¥Áè");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for (Map.Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "===" + value);
		}
	}
}
