package cn.pauu.javase.thread;

/*
 * 模拟电影院卖票，3个窗口卖100张票
 */
public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st1 = new SellTickets();
		SellTickets st2 = new SellTickets();
		SellTickets st3 = new SellTickets();
		st1.setName("窗口1");
		st2.setName("窗口2");
		st3.setName("窗口3");
		st1.start();
		st2.start();
		st3.start();
	}
}
