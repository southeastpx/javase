package cn.pauu.javase.pattern3;

import java.io.IOException;

/*
 * 单例模式应用：Runtime类
 * JDK源码：
	public class Runtime {
	    private static Runtime currentRuntime = new Runtime();
	    
	    public static Runtime getRuntime() {
	        return currentRuntime;
	    }
	    
	    private Runtime() {}
	}
*/
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		//r.exec("notepad");
		//r.exec("calc");
		//r.exec("shutdown -s -t 10000");
		r.exec("shutdown -a");
	}
}
