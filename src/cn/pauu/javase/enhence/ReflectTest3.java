package cn.pauu.javase.enhence;

import java.lang.reflect.Method;

public class ReflectTest3 {
	public static void main(String[] args) throws Exception{
		String className = args[0];
		Method mainMethod = Class.forName(className).getMethod("main", String[].class);
		mainMethod.invoke(null, (Object)new String[]{"aaa","bbb","ccc"});
	}
}
