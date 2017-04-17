package cn.pauu.javase.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * TCP��ʽ���ı��ļ���ȡ���������˿���̨���
 */
public class ClientDemo4 {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 34567);
		BufferedReader br = new BufferedReader(new FileReader("FileOutputStreamDemo3.java"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		br.close();
		s.close();
	}
}
