package cn.pauu.javase.thread;

public class ThreadGroupDemo {
	public static void main(String[] args) {
		method1();
		method2();
	}

	private static void method2() {
		MyRunnable2 my = new MyRunnable2();
		ThreadGroup tg = new ThreadGroup("这是一个新线程");
		Thread t1 = new Thread(tg,my);
		Thread t2 = new Thread(tg,my);
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());
	}

	private static void method1() {
		MyRunnable2 my = new MyRunnable2();
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());
	}
}
