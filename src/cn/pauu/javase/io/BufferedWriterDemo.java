package cn.pauu.javase.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bw.txt")));
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("bw.txt"));
			bw.write("hello");
			bw.write("world");
			bw.write("java");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
