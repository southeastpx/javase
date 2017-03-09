package cn.pauu.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求：把文本文件中的内容存储到ArrayList集合中
 */
public class FileToArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("bbb.txt"));
			String line = null;
			while((line=br.readLine())!=null){
				arrayList.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()){
			String s = iterator.next();
			System.out.println(s);
		}
		
	}
}
