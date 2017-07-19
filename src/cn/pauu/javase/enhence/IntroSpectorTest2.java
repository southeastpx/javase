package cn.pauu.javase.enhence;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class IntroSpectorTest2 {
	public static void main(String[] args) throws Exception {
		Point p = new Point(40,50);
		String properyName = "x";
		BeanInfo beanInfo = Introspector.getBeanInfo(p.getClass());
		Object retVal = null;
		PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
		for(PropertyDescriptor pd : pds){
			if(pd.getName().equals(properyName)){
				Method getMethod = pd.getReadMethod();
				retVal = getMethod.invoke(p);
			}
		}
		System.out.println(retVal);
	}
}
