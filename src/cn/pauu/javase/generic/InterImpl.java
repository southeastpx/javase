package cn.pauu.javase.generic;

//方法一
//public class InterImpl implements Inter<String> {
//
//	@Override
//	public void show(String t) {
//		System.out.println(t);
//	}
//
//}
//方法二
public class InterImpl<T> implements Inter<T> {

	@Override
	public void show(T t) {
		System.out.println(t);
	}

}
