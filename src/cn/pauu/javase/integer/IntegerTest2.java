package cn.pauu.javase.integer;

public class IntegerTest2 {
	public static void main(String[] args) {
		// ʮ���Ƶ������ƣ��˽��ƣ�ʮ������
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		//ʮ���Ƶ���������
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		
		System.out.println("-----------------------");
		//�������Ƶ�ʮ����
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
	}
}
