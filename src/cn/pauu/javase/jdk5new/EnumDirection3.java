package cn.pauu.javase.jdk5new;

public enum EnumDirection3 {
	FRONT("ǰ") {
		@Override
		public void show() {
			System.out.println("ǰ��");
		}
	}, 
	BEHIND("��"){
		@Override
		public void show() {
			System.out.println("����");
		}
	}, 
	LEFT("��"){
		@Override
		public void show() {
			System.out.println("����");
		}
	},
	RIGHT("��"){
		@Override
		public void show() {
			System.out.println("����");
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
