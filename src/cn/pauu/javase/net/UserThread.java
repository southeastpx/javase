package cn.pauu.javase.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class UserThread implements Runnable {
	private Socket s;

	public UserThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			String newName = System.currentTimeMillis() + ".jpg";
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newName));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
				bos.flush();
			}
			// 给客户端发送反馈
			OutputStream os = s.getOutputStream();
			os.write("图片上传成功".getBytes());
			bos.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
