package cn.pauu.javase.exception;

public class Teacher {
	public void check(int score) throws MyException {
		if (score > 100 || score < 0) {
			throw new MyException("分数只能在0-100之间");
		}else{
			System.out.println("分数没有问题！");
		}
	}
}
