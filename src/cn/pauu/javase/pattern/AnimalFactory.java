package cn.pauu.javase.pattern;

/*
 * �򵥹���ģʽ�����������
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
