package cn.pauu.javase.exception;

public class Teacher {
	public void check(int score) throws MyException {
		if (score > 100 || score < 0) {
			throw new MyException("����ֻ����0-100֮��");
		}else{
			System.out.println("����û�����⣡");
		}
	}
}
