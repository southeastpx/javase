package cn.pauu.javase.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 需求：写一个TCP方式的服务器端
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(9999);
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		int len = 0;
		byte[] bys = new byte[1024];
		while ((len = is.read(bys)) != -1) {
			System.out.println("server:" + new String(bys, 0, len));
		}
		// 向客户端写响应数据
		OutputStream os = s.getOutputStream();
		os.write("数据已经收到".getBytes());
		s.close();
	}
}
