package cn.pauu.javase.io;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

/*
 * 需求：使用java调用存储过程
 */
public class InvokeProcDemo {
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	public static final String USERNAME = "c##scott";
	public static final String PASSWORD = "tiger123";

	public static void main(String[] args) throws Exception {
		String sql = "{CALL mldn_proc(?,?,?)}";
		Class.forName(DRIVER);
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		CallableStatement cstmt = conn.prepareCall(sql);
		cstmt.setInt(1, 100);
		cstmt.setInt(2, 200);
		cstmt.registerOutParameter(2, Types.INTEGER);
		cstmt.registerOutParameter(3, Types.INTEGER);
		cstmt.execute();
		int inoutParam = cstmt.getInt(2);
		int outParam = cstmt.getInt(3);
		System.out.println("inoutParam=" + inoutParam + ",outParam=" + outParam);
		cstmt.close();
		conn.close();
	}
}
