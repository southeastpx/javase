package cn.pauu.javase.pattern3;

/*
 * ����ʽ:
 * 		1.������
 * 		2.�̰߳�ȫ����
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
	// �Ľ�
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
