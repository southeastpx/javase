package cn.pauu.javase.file;

import java.io.File;

/*
 * �����޸�d:\test\aaa�µ��ļ�����
 * 				001_������������,���Գ�ȥ������_����.avi��������>001_����.avi
 */
public class FileDemo10 {
	public static void main(String[] args) {
		File file = new File("d:\\test\\aaa");
		File[] files = file.listFiles();
		for(File f : files){
			String fileName = f.getName();
			String numberStr = fileName.substring(0,3);
			String lastStr = fileName.substring(fileName.lastIndexOf("_"));
			String newStr = numberStr.concat(lastStr);
			File newFile = new File(file,newStr);
			f.renameTo(newFile);
		}
	}
}
