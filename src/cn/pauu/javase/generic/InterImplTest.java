package cn.pauu.javase.generic;

public class InterImplTest {
	public static void main(String[] args) {
		Inter<String> i = new InterImpl<String>();
		i.show("hello");
		
		Inter<Integer> ii = new InterImpl<Integer>();
		ii.show(100);
	}
}
