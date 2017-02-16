package cn.pauu.javase.treeset;

public class Teacher {
	private String name;
	private int chinese;
	private int math;
	private int english;

	public Teacher() {

	}

	public Teacher(String name, int chinese, int math, int english) {
		super();
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", chinese=" + chinese + ", math=" + math + ", english=" + english + "]";
	}

	public int getSum() {
		return this.chinese + this.math + this.english;
	}
}
