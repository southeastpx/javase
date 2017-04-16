package cn.pauu.javase.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ����дһ��TCP��ʽ�ķ�������
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
		// ��ͻ���д��Ӧ����
		OutputStream os = s.getOutputStream();
		os.write("�����Ѿ��յ�".getBytes());
		s.close();
	}
}
