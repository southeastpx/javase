package cn.pauu.javase.map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * ����"aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ������a(5)b(4)c(3)d(2)e(1)
 */
public class TreeMapTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = scanner.nextLine();
		char[] chs = str.toCharArray();
		Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();
		for (char ch : chs) {
			Integer i = treeMap.get(ch);
			if (i == null) {
				treeMap.put(ch, 1);
			} else {
				i++;
				treeMap.put(ch, i);
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		Set<Character> keySet = treeMap.keySet();
		for (Character key : keySet) {
			Integer value = treeMap.get(key);
			stringBuilder.append(key).append("(").append(value).append(")");
		}
		String result = stringBuilder.toString();
		System.out.println("result:" + result);
	}
}
