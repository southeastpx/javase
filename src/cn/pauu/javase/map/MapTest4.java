package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 需求：HashMap<Student,String>
 */
public class MapTest4 {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<Student, String>();
		Student s1 = new Student("林青霞", 27);
		Student s2 = new Student("刘德华", 37);
		Student s3 = new Student("林青霞", 27);
		Student s4 = new Student("麦迪", 31);
		Student s5 = new Student("卡特", 39);
		map.put(s1, "it001");
		map.put(s2, "it003");
		map.put(s3, "it004");
		map.put(s5, "it006");
		map.put(s1, "it005");
		map.put(s4, "it002");
		Set<Map.Entry<Student, String>> entrySet = map.entrySet();
		for (Map.Entry<Student, String> entry : entrySet) {
			Student stu = entry.getKey();
			String value = entry.getValue();
			System.out.println(stu.getName() + "---" + stu.getAge() + "---" + value);
		}
	}
}
