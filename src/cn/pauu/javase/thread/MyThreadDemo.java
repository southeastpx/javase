package cn.pauu.javase.thread;

public class MyThreadDemo {
	public static void main(String[] args) {
		// MyThread my1 = new MyThread();
		// my1.setName("���»�");
		// my1.start();
		// MyThread my2 = new MyThread();
		// my2.setName("����ϼ");
		// my2.start();
		MyThread my1 = new MyThread("�ܽ���");
		MyThread my2 = new MyThread("������");
		my1.start();
		my2.start();
		System.out.println(Thread.currentThread().getName());
	}
}
