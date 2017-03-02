package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���󣺽�d:\\test\\���java.avi���Ƶ���Ŀ·����
 */
public class CopyMp4Demo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("d:\\test\\���java.avi");
			fos = new FileOutputStream("copy.avi");
			int by = 0;
			while((by = fis.read())!=-1){
				fos.write(by);
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
