package cn.pauu.javase.pattern3;
/*
 * ����ģʽ������ʽ
 */
public class Singleton {
	private Singleton() {
	}

	private static final Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}
}
