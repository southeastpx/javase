package cn.pauu.javase.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * ����TCP��ʽ�µĿͻ��˳���
 */
public class ClientDemo {
	public static void main(String[] args) throws IOException, IOException {
		Socket s = new Socket("127.0.0.1", 9999);
		OutputStream os = s.getOutputStream();
		os.write("�������������ʺ�˯��".getBytes());
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
