package cn.pauu.javase.pattern3;

public class Singleton2Demo {
	public static void main(String[] args) {
		Singleton2 instance1 = Singleton2.getInstance();
		Singleton2 instance2 = Singleton2.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance1 == instance2);
	}
}
