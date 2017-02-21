package cn.pauu.javase.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo2 {
	public static void main(String[] args) {
		// 创建一个HashMap,存入编号和牌
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// 创建牌盒子
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 创建花色数组
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 创建点数数组
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "B", "K", "A", "2" };
		// 装牌
		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				String poker = color.concat(number);
				hashMap.put(index, poker);
				list.add(index);
				index++;
			}
		}
		hashMap.put(index, "小王");
		list.add(index);
		index++;
		hashMap.put(index, "大王");
		list.add(index);
		// 洗牌
		Collections.shuffle(list);
		// 发牌
		TreeSet<Integer> player1 = new TreeSet<Integer>();
		TreeSet<Integer> player2 = new TreeSet<Integer>();
		TreeSet<Integer> player3 = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();
		for (int x = 0; x < list.size(); x++) {
			if (x >= list.size() - 3) {
				diPai.add(list.get(x));
			} else if (x % 3 == 0) {
				player1.add(list.get(x));
			} else if (x % 3 == 1) {
				player2.add(list.get(x));
			} else if (x % 3 == 2) {
				player3.add(list.get(x));
			}
		}
		//看牌
		lookPoker("刘嘉玲",player1,hashMap);
		lookPoker("关之琳",player2,hashMap);
		lookPoker("林心如",player3,hashMap);
		lookPoker("底牌",diPai,hashMap);
	}
	private static void lookPoker(String name,TreeSet<Integer> treeSet,HashMap<Integer,String> hashMap){
		System.out.print(name+"的牌是:");
		for(Integer key : treeSet){
			String poker = hashMap.get(key);
			System.out.print(poker+" ");
		}
		System.out.println();
	}
}
