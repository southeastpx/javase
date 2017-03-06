package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream("osw.txt"),"UTF-8");
			int ch = 0;
			while((ch=isr.read())!=-1){
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(isr!=null){
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
