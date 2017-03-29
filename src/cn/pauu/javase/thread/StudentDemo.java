package cn.pauu.javase.thread;

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		Productor productor = new Productor(s);
		Customer customer = new Customer(s);
		Thread proThread = new Thread(productor);
		Thread cusThread = new Thread(customer);
		proThread.start();
		cusThread.start();
	}
}
