package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ����HashMap<Integer,String>
 */
public class MapTest2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(27, "����ϼ");
		map.put(35, "�Ʊ�");
		map.put(38, "�˿�");
		map.put(30, "���»�");
		map.put(29, "����");
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		for (Map.Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "---" + value);
		}
	}
}
