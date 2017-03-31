package cn.pauu.javase.pattern3;

/*
 * ¿¡∫∫ Ω”≈ªØ
 */
public class Singleton3 {
	private Singleton3() {
	}

	private static class SingletonCreate {
		private static Singleton3 instance = new Singleton3();
	}

	public static Singleton3 getInstance() {
		return SingletonCreate.instance;
	}
}
