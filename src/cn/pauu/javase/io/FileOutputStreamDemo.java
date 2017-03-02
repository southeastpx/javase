package cn.pauu.javase.io;


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			 fos = new FileOutputStream("fos.txt");
			 byte[] bytes = "hello,io".getBytes();
			 fos.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
