package cn.pauu.javase.thread;

public class SellTickets2Demo {
	public static void main(String[] args) {
		SellTickets2 sellTickets = new SellTickets2();
		Thread t1 = new Thread(sellTickets, "����1");
		Thread t2 = new Thread(sellTickets, "����2");
		Thread t3 = new Thread(sellTickets, "����3");
		t1.start();
		t2.start();
		t3.start();
	}
}
