package cn.pauu.javase.pattern2;

public class AnimalDemo {
	public static void main(String[] args) {
		Factory f = new DogFactory();
		Animal dog = f.createAnimal();
		dog.eat();
		f = new CatFactory();
		Animal cat = f.createAnimal();
		cat.eat();
	}
}
