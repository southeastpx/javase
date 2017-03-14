package cn.pauu.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 需求：使用PrintWriter复制文本文件OutputStreamWriterDemo2.java到Copy.java
 */
public class CopyFileDemo8 {
	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("OutputStreamWriterDemo2.java"));
			pw = new PrintWriter(new FileWriter("Copy.java"),true);
			String line = null;
			while((line = br.readLine())!=null){
				pw.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(pw!=null){
				pw.close();
			}
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
