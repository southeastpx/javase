package cn.pauu.javase.thread;

/*
 * �����ڲ���ʵ�ֶ��߳�
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// ��ʽһ
		new Thread() {
			@Override
			public void run() {
				for (int x = 1; x <= 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}.start();
		// ��ʽ��
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 1; x <= 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}).start();

		// ��չ
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 1; x <= 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}) {
			@Override
			public void run() {
				for (int x = 1; x <= 100; x++) {
					System.out.println("hello" + ":" + x);
				}
			}
		}.start();
	}
}
