package cn.pauu.javase.math;

public class MathDemo {
	public static void main(String[] args) {
		System.out.println("PI:"+Math.PI);
		System.out.println("E:"+Math.E);
		System.out.println("------------------");
		System.out.println("abs:"+Math.abs(10));
		System.out.println("abs:"+Math.abs(-10));
		System.out.println("ceil:"+Math.ceil(12.34));
		System.out.println("ceil:"+Math.ceil(12.78));
		System.out.println("ceil:"+Math.floor(12.34));
		System.out.println("ceil:"+Math.floor(12.78));
		System.out.println("max:"+Math.max(12,Math.max(28, 23) ));
		System.out.println("pow:"+Math.pow(2, 3));
		System.out.println("random:"+Math.random());
		System.out.println("获取1-100的整数:"+((int)(Math.random()*100)+1));
		System.out.println("round:"+Math.round(12.34f));
		System.out.println("round:"+Math.round(12.56f));
		System.out.println("sqrt:"+Math.sqrt(4));
	}
}
