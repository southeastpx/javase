package cn.pauu.javase.jdk5new;

public class DirectionDemo {
	public static void main(String[] args) {
		Direction d = Direction.FRONT;
		System.out.println(d);
		System.out.println("-----------------");
		Direction2 d2 = Direction2.LEFT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("-----------------");
		Direction3 d3 = Direction3.BEHIND;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
	}

}
