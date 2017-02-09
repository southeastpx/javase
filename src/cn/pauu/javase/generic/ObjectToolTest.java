package cn.pauu.javase.generic;

public class ObjectToolTest {
	public static void main(String[] args) {
		ObjectTool<String> ot = new ObjectTool<String>();
		ot.setObj(new String("HELLO"));
		String s = ot.getObj();
		System.out.println(s);
		
		ObjectTool<Integer> ot1 = new ObjectTool<Integer>();
		ot1.setObj(new Integer(100));
		Integer i = ot1.getObj();
		System.out.println(i);
	}
}
