package cn.pauu.javase.thread;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThread my1 = new MyThread();
		my1.start();
		MyThread my2 = new MyThread();
		my2.start();
	}
}
