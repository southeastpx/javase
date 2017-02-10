package cn.pauu.javase.jdk5new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ���󣺼���¼�������ݣ���0������Ҫ���ڿ���̨��ӡ���������ݵ����ֵ
 */
public class ArrayListTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while (true) {
			System.out.println("���������ݣ�");
			int number = sc.nextInt();
			if (number != 0) {
				arrayList.add(number);
			} else {
				break;
			}
		}

		Integer[] i = new Integer[arrayList.size()];
		arrayList.toArray(i);
		Arrays.sort(i);
		System.out.println("�����ǣ�" + arrayToString(i) + " ���ֵ�ǣ�" + i[i.length - 1]);
	}

	public static String arrayToString(Integer[] i) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int x = 0; x < i.length; x++) {
			if (x == i.length - 1) {
				sb.append(i[x]);
			} else {
				sb.append(i[x]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
