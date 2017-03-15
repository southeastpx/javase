package cn.pauu.javase.io;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("it002", "hello");
		prop.put("it001", "world");
		prop.put("it003", "java");
		Set<Object> keySet = prop.keySet();
		for (Object key : keySet) {
			Object value = prop.get(key);
			System.out.println(key + "==" + value);
		}
	}
}
