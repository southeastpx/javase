package cn.pauu.javase.thread;

public class SellTickets2 implements Runnable {
	private int tickets = 100;

	@Override
	public void run() {
		while (true) {
			if (tickets > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "�ŵ�ӰƱ��");
			}
		}
	}

}
