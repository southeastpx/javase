package cn.pauu.javase.jdk5new;

public class Direction2 {
	private String name;
	public static final Direction2 FRONT = new Direction2("Ç°");
	public static final Direction2 BEHIND = new Direction2("ºó");
	public static final Direction2 LEFT = new Direction2("×ó");
	public static final Direction2 RIGHT = new Direction2("ÓÒ");

	private Direction2(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
