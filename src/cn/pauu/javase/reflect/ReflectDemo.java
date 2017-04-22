package cn.pauu.javase.reflect;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class ReflectDemo {
	@Test
	public void test1() throws Exception {
		Class c = Class.forName("com.pauu.javase.object.Student");
		// Constructor[] cons = c.getDeclaredConstructors();
		// for (Constructor con : cons) {
		// System.out.println(con);
		// }
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
