package cn.pauu.javase.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * ���󣺶�ȡs.txt�ļ��е�һ�У�����������ss.txt�ļ���
 */
public class StringDemo2 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader("s.txt"));
			bw = new BufferedWriter(new FileWriter("ss.txt"));
			String line = br.readLine();
			char[] chs = line.toCharArray();
			Arrays.sort(chs);
			bw.write(new String(chs));
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
