package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ����HashMap<String,String>
 */
public class MapTest1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("it001", "����");
		map.put("it003", "�׾�");
		map.put("it005", "����");
		map.put("it004", "����");
		map.put("it002", "�ų���");
		map.put("it001", "��С��");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(key + "---" + value);
		}
	}
}
