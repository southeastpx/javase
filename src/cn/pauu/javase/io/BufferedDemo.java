package cn.pauu.javase.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) {
		//write();
		read();
	}

	private static void read() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("bw2.txt"));
			String line = null;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void write() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("bw2.txt"));
			for (int x = 0; x < 10; x++) {
				bw.write("hello" + x);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
