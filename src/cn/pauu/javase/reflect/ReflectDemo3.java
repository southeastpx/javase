package cn.pauu.javase.reflect;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

import org.junit.Test;

/**
 * ��ܵı��ʣ�����+�����ļ�
 * 
 * @author peng.xing
 *
 */
public class ReflectDemo3 {
	@Test
	public void test1() {
		Properties prop = null;
		try {
			prop = new Properties();
			prop.load(new FileInputStream("reflect.properties"));
			String className = prop.getProperty("className");
			String methodName = prop.getProperty("methodName");
			Class c = Class.forName(className);
			Constructor con = c.getConstructor();
			Object obj = con.newInstance();
			Method m = c.getMethod(methodName);
			m.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * ͨ������Խ�����ͼ��
	 */
	@Test
	public void test2() throws Exception {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// arrayList.add("hello");// ����
		Class c = arrayList.getClass();
		Method method = c.getMethod("add", Object.class);
		method.invoke(arrayList, "hello");
		method.invoke(arrayList, "world");
		method.invoke(arrayList, "java");
		System.out.println(arrayList);
	}

}
