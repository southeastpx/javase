package cn.pauu.javase.pattern;

public class AnimalDemo {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		System.out.println("----------");
		// 使用简单工厂模式创建相应对象
		Animal dd = AnimalFactory.createAnimal("dog");
		dd.eat();
		Animal cc = AnimalFactory.createAnimal("cat");
		cc.eat();
	}
}
