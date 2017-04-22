package cn.pauu.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo2 {
	/**
	 * 需求：通过反射获取带参构造函数
	 */
	@Test
	public void test1() throws Exception {
		Class c = Class.forName("com.pauu.javase.object.Student");
		Constructor con = c.getDeclaredConstructor(String.class, int.class);
		Object obj = con.newInstance("刘德华", 30);
		System.out.println(obj);
	}

	/**
	 * 需求：通过反射获取私有的构造函数
	 */
	@Test
	public void test2() throws Exception {
		Class c = Class.forName("com.pauu.javase.object.Student");
		Constructor con = c.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		Object obj = con.newInstance("祖冲之");
		System.out.println(obj);
	}

	/**
	 * 需求：通过反射获取成员变量
	 */
	@Test
	public void test3() throws Exception {
		Class c = Class.forName("com.pauu.javase.object.Student");
		Field nameField = c.getDeclaredField("name");
		nameField.setAccessible(true);
		Constructor con = c.getDeclaredConstructor();
		Object obj = con.newInstance();
		nameField.set(obj, "邓肯");
		System.out.println(obj);
		Field ageField = c.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(obj, 27);
		System.out.println(obj);
	}

	/**
	 * 需求：通过反射获取无参无返回值成员方法
	 */
	@Test
	public void test4() throws Exception {
		Class c = Class.forName("com.pauu.javase.object.Student");
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method m1 = c.getDeclaredMethod("show");
		m1.invoke(obj);
	}

	/**
	 * 需求：通过反射获取各种成员方法
	 * 
	 * @throws Exception
	 */
	@Test
	public void test5() throws Exception {
		Class c = Class.forName("com.pauu.javase.object.Student");
		Object obj = c.newInstance();
		Method m1 = c.getMethod("method", String.class);
		m1.invoke(obj, "hello");
		System.out.println("------------");
		Method m2 = c.getMethod("getString", String.class, int.class);
		Object objString = m2.invoke(obj, "world", 100);
		System.out.println(objString);
		Method m3 = c.getDeclaredMethod("function");
		m3.setAccessible(true);
		m3.invoke(obj);
	}
}
