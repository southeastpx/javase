package cn.pauu.javase.file;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		//��һ�ִ�����ʽ
		File file = new File("d:\\demo\\a.txt");
		//�ڶ��ִ�����ʽ
		File file2 = new File("d:\\demo","a.txt");
		//�����ִ�����ʽ
		File file3 = new File("d:\\demo");
		File file4 = new File(file3,"a.txt");
	}
}
