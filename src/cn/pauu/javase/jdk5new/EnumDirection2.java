package cn.pauu.javase.jdk5new;

public enum EnumDirection2 {
	FRONT("ǰ"), 
	BEHIND("��"), 
	LEFT("��"),
	RIGHT("��");
	
	private String name;

	private EnumDirection2(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

}
