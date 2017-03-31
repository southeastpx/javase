package cn.pauu.javase.pattern3;

import java.io.IOException;

/*
 * ����ģʽӦ�ã�Runtime��
 * JDKԴ�룺
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
