package cn.pauu.javase.jdk5new;

import java.util.ArrayList;
import java.util.Random;

/*
 * 需要：产生10个1-20的随机数，要求不能重复
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int count = 0;
		while(count < 10){
			//产生一个随机数
			int number = random.nextInt(20)+1;
			if(!arrayList.contains(number)){
				arrayList.add(number);
				count++;
			}
		}
		
		for(Integer i : arrayList){
			System.out.println(i);
		}
	}
}
