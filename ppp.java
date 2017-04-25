package cn.pauu.javase.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("pw.txt");
			pw.write("hello");
			pw.write("world");
			pw.write("java");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			pw.close();
		}
	}
}
package cn.pauu.javase.io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) {
		//write();
		read();
	}

	private static void read() {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("raf.txt", "rw");
			int i = raf.readInt();
			System.out.println(i);
			System.out.println("��ǰ�ļ�ָ��λ���ǣ�"+raf.getFilePointer());
			char ch = raf.readChar();
			System.out.println(ch);
			System.out.println("��ǰ�ļ�ָ��λ���ǣ�"+raf.getFilePointer());
			String s = raf.readUTF();
			System.out.println(s);
			System.out.println("��ǰ�ļ�ָ��λ���ǣ�"+raf.getFilePointer());
		