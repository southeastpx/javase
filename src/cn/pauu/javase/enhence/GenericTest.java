package cn.pauu.javase.enhence;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class GenericTest {
	public static void main(String[] args) throws Exception {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("zxx", 28);
		hashMap.put("lhm", 35);
		hashMap.put("flx", 33);
		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
		for(Entry<String,Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"µÄÄêÁäÎª£º"+value);
		}
		
		Method applyMethod = GenericTest.class.getMethod("apply", Vector.class);
		Type[] types = applyMethod.getGenericParameterTypes();
		ParameterizedType pType = (ParameterizedType) types[0];
		System.out.println(pType.getRawType());
		System.out.println(pType.getActualTypeArguments()[0]);
	}
	public static void apply(Vector<Date> v1){
		
	}
}
