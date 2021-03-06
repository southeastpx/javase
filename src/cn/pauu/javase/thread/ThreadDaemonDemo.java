package cn.pauu.javase.thread;

/*
 * 当所有线程都为守护线程时，jvm自动退出
 */
public class ThreadDaemonDemo {
	public static void main(String[] args) {
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		td1.setName("关羽");
		td2.setName("张飞");
		td1.setDaemon(true);
		td2.setDaemon(true);
		td1.start();
		td2.start();
		Thread.currentThread().setName("刘备");
		for (int x = 0; x < 5; x++) {
			System.out.println(Thread.currentThread().getName() + ":" + x);
		}
	}
}
