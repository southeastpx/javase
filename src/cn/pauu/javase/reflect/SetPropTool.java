package cn.pauu.javase.reflect;

import java.lang.reflect.Field;

/**
 * �������÷���Ϊ���������������Ը�ֵ
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
