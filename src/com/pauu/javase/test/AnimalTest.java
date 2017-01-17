package com.pauu.javase.test;

import com.pauu.javase.javadoc_02.Animal;
import com.pauu.javase.javadoc_02.Cat;
import com.pauu.javase.javadoc_02.Dog;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.sleep();
		System.out.println("---------------");
		a = new Dog();
		a.eat();
		a.sleep();
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.jump();
		}
	}
}
