package cn.pauu.javase.enhence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest5 {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream ips = ReflectTest5.class.getClassLoader().getResourceAsStream("config.properties");
		//InputStream ips = new FileInputStream("D:\\workspace\\javase\\src\\config.properties");
		Properties props = null;
		try {
			props = new Properties();
			props.load(ips);
			String className = props.getProperty("className");
			Class rpClazz = Class.forName(className);
			ReflectPoint rp = (ReflectPoint) rpClazz.getConstructor(int.class,int.class).newInstance(10,30);
			System.out.println(rp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
