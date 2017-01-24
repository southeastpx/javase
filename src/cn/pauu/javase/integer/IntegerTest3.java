package cn.pauu.javase.integer;

public class IntegerTest3 {
	public static void main(String[] args) {
		//jdk5新特性：自动装箱、拆箱
		Integer i = 100;//自动装箱
		i+=200;//自动拆箱
		System.out.println("i:"+i);
		/*等价
		    Integer i = Integer.valueOf(100);
			i = Integer.valueOf(i.intValue() + 200);
			System.out.println((new StringBuilder("i:")).append(i).toString());
		 */
	}
}
