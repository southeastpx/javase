package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CopyFileDemo2 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		try {
			isr = new InputStreamReader(new FileInputStream("a.txt"));
			osw = new OutputStreamWriter(new FileOutputStream("bbb.txt"));
			// 一次读取一个字符
			// int ch = 0;
			// while ((ch = isr.read()) != -1) {
			// osw.write(ch);
			// }
			//一次读取一个字符数组
			char[] chs = new char[1024];
			int len = 0;
			while((len = isr.read(chs))!=-1){
				osw.write(chs, 0, len);
				osw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (osw != null) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
