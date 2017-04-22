package com.pauu.javase.object;

public class Student {
	private String name;
	private int age;

	private Student(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
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

	private void function() {
		System.out.println("function");
	}

	public void show() {
		System.out.println("show");
	}

	public void method(String str) {
		System.out.println("method " + str);
	}

	public String getString(String str, int i) {
		return str + i;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
