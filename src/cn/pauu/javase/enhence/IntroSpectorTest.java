package cn.pauu.javase.enhence;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class IntroSpectorTest {
	public static void main(String[] args) throws Exception {
		Point p = new Point(10, 20);
		String propertyName = "x";
		PropertyDescriptor pd = new PropertyDescriptor(propertyName, Point.class);
		Method getMethod = pd.getReadMethod();
		Object retVal = getMethod.invoke(p);
		System.out.println(retVal);
		Method setMethod = pd.getWriteMethod();
		setMethod.invoke(p,5);
		System.out.println(p.getX());
	}
}
