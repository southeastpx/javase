package cn.pauu.javase.map;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {

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

	@Override
	public int compareTo(Person p) {
		int num = this.getName().compareTo(p.getName());
		int num1 = num == 0 ? this.getAge() - p.getAge() : num;
		return num1;
	}

}
