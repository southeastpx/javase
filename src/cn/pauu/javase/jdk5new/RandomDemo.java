package cn.pauu.javase.jdk5new;

import java.util.ArrayList;
import java.util.Random;

/*
 * ��Ҫ������10��1-20���������Ҫ�����ظ�
 */
public class RandomDemo {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int count = 0;
		while(count < 10){
			//����һ�������
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
