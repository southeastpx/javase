package cn.pauu.javase.generic;

/**
 * 自定义泛型方法
 * 
 * @author peng.xing
 * @version V1.0
 */
public class ObjectTool2 {
	public <T> void show(T t) {
		System.out.println(t);
	}
}
