package cn.pauu.javase.thread;

public class ThreadSleepDemo {
	public static void main(String[] args) {
		ThreadSleep sp1 = new ThreadSleep();
		ThreadSleep sp2 = new ThreadSleep();
		ThreadSleep sp3 = new ThreadSleep();
		sp1.setName("林青霞");
		sp2.setName("刘德华");
		sp3.setName("赵雅芝");
		sp1.start();
		sp2.start();
		sp3.start();
	}
}
