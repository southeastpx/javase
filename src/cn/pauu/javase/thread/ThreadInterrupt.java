package cn.pauu.javase.thread;

import java.util.Date;

public class ThreadInterrupt extends Thread {
	@Override
	public void run() {
		System.out.println("线程执行之前：" + new Date());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("线程被终止！");
		}
		System.out.println("线程执行之后：" + new Date());
	}
}
