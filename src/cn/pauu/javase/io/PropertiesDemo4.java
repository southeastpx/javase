package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * 需求：判断文件user.txt中是否含有键lisi,如果有，修改其值为100
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
