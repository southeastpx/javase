package cn.pauu.javase.thread;

public class SellTickets2Demo {
	public static void main(String[] args) {
		SellTickets2 sellTickets = new SellTickets2();
		Thread t1 = new Thread(sellTickets, "´°¿Ú1");
		Thread t2 = new Thread(sellTickets, "´°¿Ú2");
		Thread t3 = new Thread(sellTickets, "´°¿Ú3");
		t1.start();
		t2.start();
		t3.start();
	}
}
