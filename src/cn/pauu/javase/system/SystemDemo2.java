package cn.pauu.javase.system;

public class SystemDemo2 {
	public static void main(String[] args) {
		System.out.println("Œ“√«œ≤ª∂◊„«Ú");
		//System.exit(0);
		System.out.println("Œ“√«œ≤ª∂¿∫«Ú");
		System.out.println("-------------------");
		long start = System.currentTimeMillis();
		for (int x = 0; x < 10000; x++) {
			System.out.println("hello" + x);
		}
		long end = System.currentTimeMillis();
		System.out.println("π≤∫ƒ ±:"+(end - start)+"∫¡√Î");
	}
}
