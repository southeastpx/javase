package cn.pauu.javase.thread;

public class MyThread extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 200; x++) {
			System.out.println(x);
		}
	}
}
