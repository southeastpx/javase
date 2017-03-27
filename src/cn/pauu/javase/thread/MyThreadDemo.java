package cn.pauu.javase.thread;

public class MyThreadDemo {
	public static void main(String[] args) {
		// MyThread my1 = new MyThread();
		// my1.setName("刘德华");
		// my1.start();
		// MyThread my2 = new MyThread();
		// my2.setName("林青霞");
		// my2.start();
		MyThread my1 = new MyThread("周杰伦");
		MyThread my2 = new MyThread("林心如");
		my1.start();
		my2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
