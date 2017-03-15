package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) {
		// write();
		read();
	}

	private static void read() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("obj.txt"));
			Object obj = ois.readObject();
			System.out.println(obj);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void write() {
		ObjectOutputStream oos = null;
		Person person = new Person("ΑυµΒ»ª", 30);
		try {
			oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
			oos.writeObject(person);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
