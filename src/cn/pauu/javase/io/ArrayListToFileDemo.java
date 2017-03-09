package cn.pauu.javase.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���󣺰�ArrayList�е�����д���ı��ļ���
 */
public class ArrayListToFileDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("array.txt"));
			for(String s : arrayList){
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
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
