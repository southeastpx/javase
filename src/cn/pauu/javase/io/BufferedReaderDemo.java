package cn.pauu.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("bw.txt"));
			// һ�ζ�ȡһ���ַ�
			// int ch = 0;
			// while((ch=br.read())!=-1){
			// System.out.print((char)ch);
			// }
			// һ�ζ�ȡһ���ַ�����
			char[] chs = new char[1024];
			int len = 0;
			while ((len = br.read(chs)) != -1) {
				System.out.print(new String(chs, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
