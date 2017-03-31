package cn.pauu.javase.pattern3;

public class SingletonDemo3 {
	public static void main(String[] args) {
		Singleton3 instance1 = Singleton3.getInstance();
		Singleton3 instance2 = Singleton3.getInstance();
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance1 == instance2);
	}
}
