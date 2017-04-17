package cn.pauu.javase.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * ����TCP��ʽ�ϴ��ļ�
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
		// ���߷��������ݷ�������
		s.shutdownOutput();
		// ���շ������ķ���
		BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String message = brClient.readLine();
		System.out.println(message);
		br.close();
		s.close();
	}
}
