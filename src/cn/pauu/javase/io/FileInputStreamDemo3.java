package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("ccc.txt");
			byte[] bys = new byte[1024];
			int len = 0;
			while((len=fis.read(bys))!=-1){
				System.out.print(new String(bys,0,len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
