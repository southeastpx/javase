package cn.pauu.javase.jdk5new;

public class Direction2 {
	private String name;
	public static final Direction2 FRONT = new Direction2("ǰ");
	public static final Direction2 BEHIND = new Direction2("��");
	public static final Direction2 LEFT = new Direction2("��");
	public static final Direction2 RIGHT = new Direction2("��");

	private Direction2(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
