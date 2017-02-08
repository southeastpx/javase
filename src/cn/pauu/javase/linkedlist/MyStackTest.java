package cn.pauu.javase.linkedlist;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.add("hello");
		stack.add("world");
		stack.add("java");
		while(!stack.isEmpty()){
			System.out.println(stack.get());
		}
	}
}
