package cn.pauu.javase.thread;

public class MyRunnableDemo {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable();
		new Thread(my, "金融事业部").start();
		new Thread(my, "期货事业部").start();
	}
}
