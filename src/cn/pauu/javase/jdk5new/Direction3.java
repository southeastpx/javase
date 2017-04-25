package cn.pauu.javase.jdk5new;

public abstract class Direction3 {
	private String name;
	public static final Direction3 FRONT = new Direction3("ǰ") {
		@Override
		public void show() {
			System.out.println("ǰ��");
		};
	};
	public static final Direction3 BEHIND = new Direction3("��") {
		@Override
		public void show() {
			System.out.println("����");
		};
	};
	public static final Direction3 LEFT = new Direction3("��") {
		@Override
		public void show() {
			System.out.println("����");
		};
	};
	public static final Direction3 RIGHT = new Direction3("��") {
		@Override
		public void show() {
			System.out.println("����");
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
