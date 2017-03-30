package cn.pauu.javase.thread;

/*
 * 匿名内部类实现多线程
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 方式一
		new Thread() {
			@Override
			public void run() {
				for (int x = 1; x <= 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}.start();
		// 方式二
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 1; x <= 100; x++) {
					System.out.println(Thread.currentThread().getName() + ":" + x);
				}
			}
		}).start();

		// 扩展
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
