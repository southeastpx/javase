package cn.pauu.javase.doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerDemo {
	public static void main(String[] args) {
		// 牌盒子
		List<String> list = new ArrayList<String>();
		// 牌的花色
		String[] colors = { "♠", "♥", "♣", "♦" };
		// 牌的点数
		String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// 装牌
		for (String color : colors) {
			for (String number : numbers) {
				list.add(color.concat(number));
			}
		}
		list.add("小王");
		list.add("大王");
		// 洗牌
		Collections.shuffle(list);
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		ArrayList<String> diPai = new ArrayList<String>();
		// 发牌
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
		lookPoker("黄晓明",player1);
		lookPoker("刘德华",player2);
		lookPoker("邓超",player3);
		lookPoker("底牌",diPai);
	}
	private static void lookPoker(String name,ArrayList<String> list){
		System.out.print(name+"的牌是:");
		for(String s : list){
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
