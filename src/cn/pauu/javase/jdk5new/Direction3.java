package cn.pauu.javase.jdk5new;

public abstract class Direction3 {
	private String name;
	public static final Direction3 FRONT = new Direction3("前") {
		@Override
		public void show() {
			System.out.println("前面");
		};
	};
	public static final Direction3 BEHIND = new Direction3("后") {
		@Override
		public void show() {
			System.out.println("后面");
		};
	};
	public static final Direction3 LEFT = new Direction3("左") {
		@Override
		public void show() {
			System.out.println("左面");
		};
	};
	public static final Direction3 RIGHT = new Direction3("右") {
		@Override
		public void show() {
			System.out.println("右面");
		};
	};

	private Direction3(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void show();
}
