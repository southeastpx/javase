package cn.pauu.javase.thread;

public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep sp1 = new ThreadSleep();
		ThreadSleep sp2 = new ThreadSleep();
		ThreadSleep sp3 = new ThreadSleep();
		sp1.setName("����ϼ");
		sp2.setName("���»�");
		sp3.setName("����֥");
		sp1.start();
		sp2.start();
		sp3.start();
	}
}
