package cn.pauu.javase.jdk5new;

public class DirectionDemo2 {
	public static void main(String[] args) {
		EnumDirection ed = EnumDirection.FRONT;
		System.out.println(ed);
		System.out.println("---------------------");
		EnumDirection2 ed2 = EnumDirection2.BEHIND;
		System.out.println(ed2);
		System.out.println(ed2.getName());
		System.out.println("----------------------");
		EnumDirection3 ed3 = EnumDirection3.LEFT;
		System.out.println(ed3);
		System.out.println(ed3.getName());
		ed3.show();
		switch (ed3) {
		case FRONT:
			System.out.println("��ѡ����ǰ��");
			break;
		case BEHIND:
			System.out.println("��ѡ���˺���");
			break;
		case LEFT:
			System.out.println("��ѡ��������");
			break;
		case RIGHT:
			System.out.println("��ѡ��������");
			break;
		}
	}

}
