package cn.pauu.javase.pattern2;

public class DogFactory extends Factory {

	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
