package cn.pauu.javase.jdk5new;

public enum EnumDirection2 {
	FRONT("Ç°"), 
	BEHIND("ºó"), 
	LEFT("×ó"),
	RIGHT("ÓÒ");
	
	private String name;

	private EnumDirection2(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

}
