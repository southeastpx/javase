package cn.pauu.javase.thread;

/*
 * 资源类
 */
public class Student {
	private String name;
	private int age;
	private boolean flag;// 判断标记，有无资源

	/*
	 * 生产资源
	 */
	public synchronized void set(String name, int age) {
		if (this.flag) {// 有资源就等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 没有资源就生产资源
		this.name = name;
		this.age = age;
		this.flag = true;
		this.notify();
	}

	/*
	 * 消费资源
	 */
	public synchronized void get() {
		if (!this.flag) {// 没有资源就等待
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
