package cn.pauu.javase.thread;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	public static void main(String[] args) {
		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("������ը�ˣ���");
			}
		}, 3000, 2000);
	}
}
