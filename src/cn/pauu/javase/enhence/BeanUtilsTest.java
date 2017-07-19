package cn.pauu.javase.enhence;


import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

public class BeanUtilsTest {
	public static void main(String[] args) throws Exception {
		Point p = new Point(80, 90);
		System.out.println(BeanUtils.getProperty(p, "x"));
		BeanUtils.setProperty(p, "y", "9");
		System.out.println(BeanUtils.getProperty(p, "y"));
		PropertyUtils.setProperty(p, "x", 9);
		System.out.println(PropertyUtils.getProperty(p, "x"));
	}
}
