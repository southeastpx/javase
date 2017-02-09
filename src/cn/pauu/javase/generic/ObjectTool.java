package cn.pauu.javase.generic;
/**
 * 自定义泛型类
 * @author peng.xing
 *
 * @param <T>
 */
public class ObjectTool<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
