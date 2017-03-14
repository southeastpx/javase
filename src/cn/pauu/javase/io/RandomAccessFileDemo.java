package cn.pauu.javase.io;

import java.io.FileNotFoundException;
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
			System.out.println("当前文件指针位置是："+raf.getFilePointer());
			char ch = raf.readChar();
			System.out.println(ch);
			System.out.println("当前文件指针位置是："+raf.getFilePointer());
			String s = raf.readUTF();
			System.out.println(s);
			System.out.println("当前文件指针位置是："+raf.getFilePointer());
			raf.seek(4);
			ch = raf.readChar();
			System.out.println(ch);
			System.out.println("当前文件指针位置是："+raf.getFilePointer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void write() {
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("raf.txt", "rw");
			raf.writeInt(100);
			raf.writeChar('A');
			raf.writeUTF("中国");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(raf!=null){
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
