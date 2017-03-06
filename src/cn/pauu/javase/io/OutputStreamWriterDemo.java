package cn.pauu.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 需求：转换流练习（字节流-->字符流）
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		try {
			osw = new OutputStreamWriter(new FileOutputStream("osw.txt"),"UTF-8");
			osw.write("中国");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(osw!=null){
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
