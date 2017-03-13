package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.IOException;

public class MyLineNumberReaderTest {
	public static void main(String[] args) {
		MyLineNumberReader mlnr = null;
		try {
			 mlnr = new MyLineNumberReader(new FileReader("a.txt"));
//			 System.out.println(mlnr.getLineNumber());
//			 System.out.println(mlnr.getLineNumber());
//			 System.out.println(mlnr.getLineNumber());
			 String line = null;
			 while((line=mlnr.readLine())!=null){
				 System.out.println(mlnr.getLineNumber()+":"+line);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(mlnr!=null){
				try {
					mlnr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
