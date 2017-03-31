package cn.pauu.javase.pattern2;

public class CatFactory extends Factory {

	@Override
	public Animal createAnimal() {
		return new Cat();
	}

}
