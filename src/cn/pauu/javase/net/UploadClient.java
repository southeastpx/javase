package cn.pauu.javase.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 需求：TCP方式上传文件
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 10086);
		BufferedReader br = new BufferedReader(new FileReader("FileOutputStreamDemo3.java"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// 告诉服务器数据发送完了
		s.shutdownOutput();
		// 接收服务器的反馈
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String message = brClient.readLine();
		System.out.println(message);
		br.close();
		s.close();
	}
}
