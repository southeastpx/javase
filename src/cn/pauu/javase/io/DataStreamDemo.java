package cn.pauu.javase.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * 写基本数据类型的数据流
 */
public class DataStreamDemo {
	public static void main(String[] args) {
		// 写数据
		write();
		// 读数据
		read();
	}

	private static void read() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("dos.txt"));
			byte b = dis.readByte();
			short s = dis.readShort();
			int i = dis.readInt();
			long l = dis.readLong();
			char c = dis.readChar();
			float f = dis.readFloat();
			double d = dis.readDouble();
			boolean bb = dis.readBoolean();
			System.out.println(b);
			System.out.println(s);
			System.out.println(i);
			System.out.println(l);
			System.out.println(c);
			System.out.println(f);
			System.out.println(d);
			System.out.println(bb);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void write() {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("dos.txt"));
			dos.writeByte(10);
			dos.writeShort(100);
			dos.writeInt(1000);
			dos.writeLong(10000);
			dos.writeChar('a');
			dos.writeFloat(12.34F);
			dos.writeDouble(45.67);
			dos.writeBoolean(true);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
