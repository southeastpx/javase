package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * �����ж��ļ�user.txt���Ƿ��м�lisi,����У��޸���ֵΪ100
 */
public class PropertiesDemo4 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("user.txt"));
		Set<String> keySet = prop.stringPropertyNames();
		for (String key : keySet) {
			if ("lisi".equals(key)) {
				prop.setProperty(key, "100");
			}
		}
		prop.store(new FileWriter("user.txt"), null);
	}
}
