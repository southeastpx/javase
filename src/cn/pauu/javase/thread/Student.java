package cn.pauu.javase.thread;

/*
 * ��Դ��
 */
public class Student {
	private String name;
	private int age;
	private boolean flag;// �жϱ�ǣ�������Դ

	/*
	 * ������Դ
	 */
	public synchronized void set(String name, int age) {
		if (this.flag) {// ����Դ�͵ȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// û����Դ��������Դ
		this.name = name;
		this.age = age;
		this.flag = true;
		this.notify();
	}

	/*
	 * ������Դ
	 */
	public synchronized void get() {
		if (!this.flag) {// û����Դ�͵ȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.name + "===" + this.age);
		this.flag = false;
		this.notify();
	}
}
