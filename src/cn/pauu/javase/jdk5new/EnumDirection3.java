package cn.pauu.javase.jdk5new;

public enum EnumDirection3 {
	FRONT("前") {
		@Override
		public void show() {
			System.out.println("前面");
		}
	}, 
	BEHIND("后"){
		@Override
		public void show() {
			System.out.println("后面");
		}
	}, 
	LEFT("左"){
		@Override
		public void show() {
			System.out.println("左面");
		}
	},
	RIGHT("右"){
		@Override
		public void show() {
			System.out.println("右面");
		}
	};
	private String name;
	private EnumDirection3(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract void show();
}
