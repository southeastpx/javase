package cn.pauu.javase.io;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 749065370641522770L;
	private String name;
	// 被transient修饰的变量不能被序列化
	private transient int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
