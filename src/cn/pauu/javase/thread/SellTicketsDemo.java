package cn.pauu.javase.thread;

/*
 * ģ���ӰԺ��Ʊ��3��������100��Ʊ
 */
public class SellTicketsDemo {
	public static void main(String[] args) {
		SellTickets st1 = new SellTickets();
		SellTickets st2 = new SellTickets();
		SellTickets st3 = new SellTickets();
		st1.setName("����1");
		st2.setName("����2");
		st3.setName("����3");
		st1.start();
		st2.start();
		st3.start();
	}
}
