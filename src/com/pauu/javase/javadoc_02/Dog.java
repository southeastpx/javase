package com.pauu.javase.javadoc_02;

import com.pauu.javase.javadoc_01.Jump;

/**
 * 这是具体的狗类
 * @author peng.xing
 * @version v1.0
 */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("会跳高的狗");
	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}
	
	@Override
	public void sleep(){
		System.out.println("狗站着睡觉");
	}
}
