package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyMp4Demo2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("d:\\test\\ÄãºÃjava.avi");
			fos = new FileOutputStream("copymp4.avi");
			byte[] bys = new byte[1024];
			int len = 0;
			while((len = fis.read(bys))!=-1){
				fos.write(bys, 0, len);
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
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
