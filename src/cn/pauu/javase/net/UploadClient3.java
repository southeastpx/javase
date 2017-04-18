package cn.pauu.javase.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class UploadClient3 {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 10086);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("thread.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
			bos.flush();
		}
		// 告诉服务器，数据发送完毕
		s.shutdownOutput();
		// 接受服务器反馈
		BufferedInputStream bisClient = new BufferedInputStream(s.getInputStream());
		byte[] bys2 = new byte[1024];
		int len2 = bisClient.read(bys2);
		String data = new String(bys2, 0, len2);
		System.out.println(data);
	}
}
