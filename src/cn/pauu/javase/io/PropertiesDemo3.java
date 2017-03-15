package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * 集合与IO流的结合--->Properties
 */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		//myLoad();
		myStore();
	}

	private static void myStore() throws IOException{
		Properties prop = new Properties();
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "40");
		prop.setProperty("wangwu", "50");
		prop.store(new FileWriter("prop.txt"), "姓名年龄信息");
	}

	private static void myLoad() throws IOException {
		Properties prop = new Properties();
		System.out.println("1:" + prop);
		prop.load(new FileReader("db.properties"));
		System.out.println("2:" + prop);
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println("driver:" + driver);
		System.out.println("url:" + url);
		System.out.println("username:" + username);
		System.out.println("password:" + password);
	}
}
