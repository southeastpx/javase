package cn.pauu.javase.enhence;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest2 {
	public static void main(String[] args) throws Exception {
		ReflectPoint point = new ReflectPoint(5,3);
		Field fieldY = point.getClass().getField("y");
		System.out.println(fieldY.get(point));
		Field fieldX = point.getClass().getDeclaredField("x");
		fieldX.setAccessible(true);
		System.out.println(fieldX.get(point));
		Field[] fields = point.getClass().getDeclaredFields();
		for(Field field : fields){
			field.setAccessible(true);
			if(field.getType() == String.class){
				String oldValue = (String) field.get(point);
				String newValue = oldValue.replace("b", "a");
				field.set(point, newValue);
			}
		}
		System.out.println(point);
		
		String str = "abc";
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		System.out.println(methodCharAt.invoke(str, 2));
	}
}
