package cn.pauu.javase.thread;

/*
 * ������
 */
public class Productor implements Runnable {
	private Student s;
	private int x = 0;

	public Productor(Student s) {
		this.s = s;
	}

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				s.set("����ϼ", 27);
			} else {
				s.set("����", 27);
			}
			x++;
		}
	}
}
