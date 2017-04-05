package cn.pauu.javase.pattern4;

public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		userDao.add();
	}
}
