package cn.pauu.javase.pattern5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestProxy {
	public static void main(String[] args) {
		final UserDao userDao = new UserDaoImpl();
		userDao.add();
		userDao.delete();
		userDao.update();
		userDao.find();
		System.out.println("-------------------------");
		UserDao proxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
				userDao.getClass().getInterfaces(), new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("权限校验");
						method.invoke(userDao, args);
						System.out.println("日志记录");
						return null;
					}

				});
		proxy.add();
		proxy.delete();
		proxy.update();
		proxy.find();
	}
}
