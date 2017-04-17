package cn.pauu.javase.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10086);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw = new BufferedWriter(new FileWriter("NetCopy.java"));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		// 给客户端反馈
		BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bwServer.write("文件上传成功");
		bwServer.newLine();
		bwServer.flush();
		bw.close();
		s.close();
	}
}
