package com.pauu.javase.stringbuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		// StringBuffer sb = new StringBuffer();
		// System.out.println("sb:"+sb);
		// System.out.println("sb.length():"+sb.length());
		// System.out.println("sb.capacity():"+sb.capacity());
		// System.out.println("-----------------------------");
		// StringBuffer sb2 = new StringBuffer(50);
		// System.out.println("sb2:"+sb2);
		// System.out.println("sb2.length():"+sb2.length());
		// System.out.println("sb2.capacity():"+sb2.capacity());
		// System.out.println("-----------------------------");
		// StringBuffer sb3 = new StringBuffer("hello");
		// System.out.println("sb3:"+sb3.toString());
		// System.out.println("sb3.length():"+sb3.length());
		// System.out.println("sb3.capacity():"+sb3.capacity());
		// StringBuffer sb = new StringBuffer();
		// sb.append("hello");
		// sb.append(true);
		// sb.append(12);
		// sb.append(34.56f);
		// sb.append("hello").append(true).append(12).append(34.56);
		// System.out.println("sb:" + sb);
		// sb.insert(5, "world");
		// System.out.println("sb:" + sb);
		// System.out.println("sb2:"+sb2);
		// System.out.println(sb == sb2);
		// StringBuffer sb = new StringBuffer();
		// sb.append("hello").append("world").append("java");
		// System.out.println("sb:" + sb);
		// sb.replace(5, 10, "chinaa");
		// sb.deleteCharAt(1);
		// sb.deleteCharAt(1);
		// sb.delete(5, 10);
		// sb.delete(0, sb.length());
		// System.out.println("sb:" + sb);
		// sb.reverse();
		// System.out.println("sb.reverse():"+sb);
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("java");
		System.out.println("sb:"+sb);
		String s = sb.substring(5);
		System.out.println("sb:" + sb);
		System.out.println("s:" + s);
		String ss = sb.substring(5,10);
		System.out.println("sb:" + sb);
		System.out.println("s:" + ss);
	}
}
