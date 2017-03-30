package cn.pauu.javase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		threadPool.submit(new MyRunnable3());
		threadPool.submit(new MyRunnable3());
		threadPool.shutdown();
	}
}
