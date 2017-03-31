package cn.pauu.javase.pattern3;

/*
 * 懒汉式:
 * 		1.懒加载
 * 		2.线程安全问题
 */
public class Singleton2 {
	private Singleton2() {
	}

	private static volatile Singleton2 instance = null;

	// public synchronized static Singleton2 getInstance(){
	// if(instance == null){
	// instance = new Singleton2();
	// }
	// return instance;
	// }
	// 改进
	public static Singleton2 getInstance() {
		if (instance == null) {
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
}
