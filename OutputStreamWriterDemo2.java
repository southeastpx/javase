package cn.pauu.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 字符流的5种写方法
 */
public abstract class OutputStreamWriterDemo2 {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		try {
			osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));
			// 第一种，写一个字符
			osw.write('a');
			osw.write(97);
			// 第二种，写一个字符数组
			char[] chs = { 'a', 'b', 'c', 'd', 'e' };
			osw.write(chs);
			// 第三种，写一个字符数组的一部分
			osw.write(chs, 1, 3);
			// 第四种，写一个字符串
			osw.write("我爱中国");
			// 第五种，写一个字符串的一部分
			osw.write("明天去踢球", 2, 3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
