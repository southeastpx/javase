package cn.pauu.javase.thread;

public class ThreadSleep extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 200; x++) {
			System.out.println(this.getName() + "===" + x);
			// Ïß³ÌË¯Ãß
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
