package cn.pauu.javase.jdk5new;

import java.util.ArrayList;

public class HenceForDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// ��ͨforѭ��
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		System.out.println("-----------");
		//��ǿforѭ��
		for(int x : arr){
			System.out.println(x);
		}
		
		System.out.println("-----------");
		String[] arr1 = {"���»�","Ҧ��","����"};
		for(String s : arr1){
			System.out.println(s);
		}
		
		System.out.println("-----------");
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		for(String s : list){
			/*if("world".equals(s)){
				list.add("andriod");//���ڲ����޸��쳣����ǿfor��ʵ���ǵ�����
			}*/
			System.out.println(s);
		}
	}
}
