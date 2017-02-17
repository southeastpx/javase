package cn.pauu.javase.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 需求：HashMap<String,Student>
 */
public class MapTest3 {
	public static void main(String[] args) {
		Map<String,Student> map = new HashMap<String,Student>();
		Student s1 = new Student("林青霞",27);
		Student s2 = new Student("刘德华",37);
		Student s3 = new Student("姚明",29);
		Student s4 = new Student("麦迪",31);
		Student s5 = new Student("卡特",39);
		map.put("s001", s1);
		map.put("s003", s2);
		map.put("s005", s3);
		map.put("s002", s4);
		map.put("s004", s5);
		map.put("s006", s1);
		
		Set<String> keySet = map.keySet();
		for(String key : keySet){
			Student stu = map.get(key);
			System.out.println(key+"---"+stu.getName()+"---"+stu.getAge());
		}
	}
}
