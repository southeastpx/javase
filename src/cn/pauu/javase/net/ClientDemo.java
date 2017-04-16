package cn.pauu.javase.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 需求：TCP方式下的客户端程序
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket("127.0.0.1", 9999);
		OutputStream os = s.getOutputStream();
		os.write("今天天气不错，适合睡觉".getBytes());
		InputStream is = s.getInputStream();
		int len = 0;
		byte[] bys = new byte[1024];
		while ((len = is.read(bys)) != -1) {
			String client = new String(bys, 0, len);
			System.out.println("client:" + client);
		}
		s.close();
	}
}
