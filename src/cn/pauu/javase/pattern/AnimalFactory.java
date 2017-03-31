package cn.pauu.javase.pattern;

/*
 * 简单工厂模式创建动物对象
 */
public class AnimalFactory {
	private AnimalFactory() {
	}

	public static Animal createAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		} else if ("cat".equals(type)) {
			return new Cat();
		}
		return null;
	}
}
