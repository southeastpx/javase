package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo3 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("a.txt");
			fw = new FileWriter("bcd.txt");
			// 一次读取一个字符
			// int ch = 0;
			// while ((ch = fr.read()) != -1) {
			// fw.write(ch);
			// }
			// 一次读取一个字符数组
			char[] chs = new char[1024];
			int len = 0;
			while ((len = fr.read(chs)) != -1) {
				fw.write(chs, 0, len);
				fw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
