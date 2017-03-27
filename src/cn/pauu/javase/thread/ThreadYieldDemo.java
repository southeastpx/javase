package cn.pauu.javase.thread;

public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		ty1.setName("ÁõµÂ»ª");
		ty2.setName("ÕÔÑÅÖ¥");
		ty1.start();
		ty2.start();
	}
}
