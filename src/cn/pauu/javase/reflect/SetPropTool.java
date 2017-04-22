package cn.pauu.javase.reflect;

import java.lang.reflect.Field;

/**
 * 需求：利用反射为任意对象的任意属性赋值
 * 
 * @author peng.xing
 *
 */
public class SetPropTool {
	public static void setProperties(Object obj, String propertyName, Object value) throws Exception {
		Class c = obj.getClass();
		Field field = c.getDeclaredField(propertyName);
		field.setAccessible(true);
		field.set(obj, value);
	}
}
