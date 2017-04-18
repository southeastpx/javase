package cn.pauu.javase.net;

import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer3 {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(10086);
		while (true) {
			Socket s = ss.accept();
			new Thread(new UserThread(s)).start();
		}
	}
}
