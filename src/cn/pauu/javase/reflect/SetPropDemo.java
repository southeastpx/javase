package cn.pauu.javase.reflect;

public class SetPropDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		SetPropTool.setProperties(p, "name", "ÕÅÈý");
		SetPropTool.setProperties(p, "age", 30);
		System.out.println(p);
		Dog d = new Dog();
		SetPropTool.setProperties(d, "sex", 'ÄÐ');
		SetPropTool.setProperties(d, "price", 12.34f);
		System.out.println(d);
	}
}

class Person {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

class Dog {
	char sex;
	float price;

	@Override
	public String toString() {
		return "Dog [sex=" + sex + ", price=" + price + "]";
	}

}
