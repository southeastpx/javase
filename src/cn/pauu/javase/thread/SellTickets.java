package cn.pauu.javase.thread;

public class SellTickets extends Thread {
	private static int ticket = 100;

	@Override
	public void run() {
		// 一直有票卖
		while (true) {
			if (ticket > 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + "正在出售第" + (ticket--) + "张票！");
			}
		}
	}
}
