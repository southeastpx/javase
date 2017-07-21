package cn.pauu.javase.enhence;

import java.util.Date;

public class ClassLoaderTest {
	public static void main(String[] args) throws Exception {
		/*ClassLoader loader = ClassLoaderTest.class.getClassLoader();
		while(loader != null){
			System.out.println(loader.getClass().getName());
			loader = loader.getParent();
		}
		System.out.println(loader);*/
		//System.out.println(ClassLoaderTest.class.getClassLoader().getClass().getName());
		System.out.println("xxx");
		Class clazz = new MyClassLoader("itcastlib").findClass("cn.pauu.javase.enhence.ClassLoaderAttach");
		Date d = (Date)clazz.newInstance();
		System.out.println(d.toString());
	}
}
