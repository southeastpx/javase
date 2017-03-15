package cn.pauu.javase.io;

import java.util.Properties;
import java.util.Set;

/*
 * ����Properties�����й���
 */
public class PropertiesDemo2 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("itcast02", "bixiangdong");
		prop.setProperty("itcast01", "lihuoming");
		prop.setProperty("itcast03", "fanglixun");
		Set<String> keySet = prop.stringPropertyNames();
		for(String key : keySet){
			String value = prop.getProperty(key);
			System.out.println(key+"=="+value);
		}
	}
}
