package cn.pauu.javase.enhence;

public class ClassLoaderTest {
	public static void main(String[] args) {
		/*ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		while(loader != null){
			System.out.println(loader.getClass().getName());
			loader = loader.getParent();
		}
		System.out.println(loader);*/
		System.out.println(ClassLoaderTest.class.getClassLoader().getClass().getName());
	}
}
