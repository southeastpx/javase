package cn.pauu.javase.thread;

public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		new Thread(my, "������ҵ��").start();
		new Thread(my, "�ڻ���ҵ��").start();
	}
}
