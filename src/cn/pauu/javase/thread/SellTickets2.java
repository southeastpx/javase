package cn.pauu.javase.thread;

/*
 * 1.ͬ�������������������
 * 2.ͬ������������this
 * 3.��̬ͬ�����������ǵ�ǰ����ֽ���
 */
public class SellTickets2 implements Runnable {
	private static int tickets = 100;
	private Object obj = new Object();// �������
	private Demo d = new Demo();
	private int x = 0;

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (SellTickets2.class) {
					if (tickets > 0) {
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "�ŵ�ӰƱ��");
					}
				}
				x++;
			} else {
				sellTickets();
				x++;
			}
		}
	}

	private static synchronized void sellTickets() {
		if (tickets > 0) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + (tickets--) + "�ŵ�ӰƱ��");
		}
	}

}

class Demo {

}