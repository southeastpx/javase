package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		// System.out.println(map.put("ÎÄÕÂ", "ÂíÒÁ¬P"));
		// System.out.println(map.put("ÎÄÕÂ", "Ò¦µÑ"));
		map.put("µË³¬", "ËïÙ³");
		map.put("»ÆÏşÃ÷", "ÑîÓ±");
		map.put("ÁõâıÍş", "ÑîÃİ");
		map.put("ÖÜ½ÜÂ×", "À¥Áè");
		// map.clear();
		// System.out.println(map.remove("»ÆÏşÃ÷"));
		// System.out.println(map.remove("»ÆÏş²¨"));
		System.out.println("containsKey:" + map.containsKey("»ÆÏşÃ÷"));
		System.out.println("containsKey:" + map.containsKey("»ÆÏş²¨"));
		System.out.println("containsValue:" + map.containsValue("À¥Áè"));
		System.out.println("containsValue:" + map.containsValue("²ÌÒÀÁÖ"));
		System.out.println("isEmpty:" + map.isEmpty());

		System.out.println("map:" + map);
	}
}
