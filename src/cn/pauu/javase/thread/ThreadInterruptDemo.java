package cn.pauu.javase.thread;

public class ThreadInterruptDemo {
	public static void main(String[] args) {
		ThreadInterrupt ti = new ThreadInterrupt();
		ti.start();
		try {
			Thread.sleep(3000);
			ti.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
