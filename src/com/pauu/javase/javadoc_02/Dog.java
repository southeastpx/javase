package com.pauu.javase.javadoc_02;

import com.pauu.javase.javadoc_01.Jump;

/**
 * ���Ǿ���Ĺ���
 * @author peng.xing
 * @version v1.0
 */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("�����ߵĹ�");
	}

	@Override
	public void eat() {
		System.out.println("������");
	}
	
	@Override
	public void sleep(){
		System.out.println("��վ��˯��");
	}
}
