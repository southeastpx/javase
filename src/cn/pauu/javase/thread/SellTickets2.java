package cn.pauu.javase.thread;

/*
 * 1.同步代码块的锁是任意对象
 * 2.同步方法的锁是this
 * 3.静态同步方法的锁是当前类的字节码
 */
public class SellTickets2 implements Runnable {
	private static int tickets = 100;
	private Object obj = new Object();// 共享的锁
	private Demo d = new Demo();
	private int x = 0;

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTickets2.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张电影票！");
					}
				}
				x++;
			} else {
				sellTickets();
				x++;
			}
		}
	}

	private static synchronized void sellTickets() {
		if (tickets > 0) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张电影票！");
		}
	}

}

class Demo {

}