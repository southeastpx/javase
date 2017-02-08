package cn.pauu.javase.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		for (int i = 0; i < v.size(); i++) {
			String s = (String) v.elementAt(i);
			System.out.println(s);
		}
		
		System.out.println("----------");
		Enumeration en = v.elements();
		while(en.hasMoreElements()){
			String s = (String) en.nextElement();
			System.out.println(s);
		}
	}
}
