package cn.pauu.javase.system;

public class SystemDemo {
	public static void main(String[] args) {
		Person p = new Person("���»�",50);
		System.out.println(p);
		p = null;
		System.gc();
	}
}
