package cn.pauu.javase.thread;

/*
 * ������
 */
public class Customer implements Runnable {
	private Student s;

	public Customer(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			s.get();
		}
	}
}
