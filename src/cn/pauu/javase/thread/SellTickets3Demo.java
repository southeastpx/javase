package cn.pauu.javase.thread;

public class SellTickets3Demo {
	public static void main(String[] args) {
		SellTickets3 st = new SellTickets3();
		Thread t1 = new Thread(st, "����1");
		Thread t2 = new Thread(st, "����2");
		Thread t3 = new Thread(st, "����3");
		t1.start();
		t2.start();
		t3.start();
	}
}
