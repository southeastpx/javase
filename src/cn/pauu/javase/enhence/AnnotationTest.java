package cn.pauu.javase.enhence;

public class AnnotationTest {
	public static void main(String[] args) {
		boolean flag = Point.class.isAnnotationPresent(SfitAnnotatiion.class);
		if(flag){
			SfitAnnotatiion annotation = (SfitAnnotatiion)Point.class.getAnnotation(SfitAnnotatiion.class);
			System.out.println(annotation);
			System.out.println(annotation.color());
			System.out.println(annotation.value());
			System.out.println(annotation.attrArr().length);
			System.out.println(annotation.lamp().nextLamp().toString());
			System.out.println(annotation.annotation().value());
		}
	}
}
