package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 需求：InputStreamReaderDemo2
 */
public class InputStreamReaderDemo2 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream("CopyMp4Demo3.java"));
			/*
			 * //一次读取一个字符 int ch = 0; while((ch = isr.read())!=-1){
			 * System.out.print((char)ch); }
			 */
			// 一次读取一个字符数组
			char[] chs = new char[1024];
			int len = 0;
			while ((len = isr.read(chs)) != -1) {
				System.out.print(new String(chs, 0, len));
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
		}
	}
}
