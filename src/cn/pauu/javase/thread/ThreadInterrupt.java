package cn.pauu.javase.thread;

import java.util.Date;

public class ThreadInterrupt extends Thread {
	@Override
	public void run() {
		System.out.println("�߳�ִ��֮ǰ��" + new Date());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("�̱߳���ֹ��");
		}
		System.out.println("�߳�ִ��֮��" + new Date());
	}
}
