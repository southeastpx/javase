package cn.pauu.javase.integer;

public class IntegerTest3 {
	public static void main(String[] args) {
		//jdk5�����ԣ��Զ�װ�䡢����
		Integer i = 100;//�Զ�װ��
		i+=200;//�Զ�����
		System.out.println("i:"+i);
		/*�ȼ�
		    Integer i = Integer.valueOf(100);
			i = Integer.valueOf(i.intValue() + 200);
			System.out.println((new StringBuilder("i:")).append(i).toString());
		 */
	}
}
