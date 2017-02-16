package cn.pauu.javase.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*
 * ���󣺴���10��1��20��������Ҫ�����ظ�
 */
public class SetTest {
	public static void main(String[] args) {
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		while(hashSet.size()<10){
			hashSet.add(random.nextInt(20)+1);
		}
		
		for(Iterator<Integer> iterator = hashSet.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
}
