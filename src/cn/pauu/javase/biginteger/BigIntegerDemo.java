package cn.pauu.javase.biginteger;

import java.math.BigInteger;

public class BigIntegerDemo {
	public static void main(String[] args) {
		BigInteger bi = new BigInteger("2147483648");
		System.out.println(bi);
		System.out.println("---------------");
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("50");
		System.out.println("add:"+bi1.add(bi2));
		System.out.println("substract:"+bi1.subtract(bi2));
		System.out.println("multiply:"+bi1.multiply(bi2));
		System.out.println("divide:"+bi1.divide(bi2));
		BigInteger[] bis = bi1.divideAndRemainder(bi2);
		System.out.println("ษฬ:"+bis[0]);
		System.out.println("ำเสý:"+bis[1]);
	}
}
