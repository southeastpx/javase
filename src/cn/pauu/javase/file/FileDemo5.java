package cn.pauu.javase.file;

import java.io.File;

public class FileDemo5 {
	public static void main(String[] args) {
		File file = new File("aaa.txt");
		System.out.println("isDirectory:"+file.isDirectory());//false
		System.out.println("isFile:"+file.isFile());//true
		System.out.println("exists:"+file.exists());//true
		System.out.println("canRead:"+file.canRead());//true
		System.out.println("canWrite:"+file.canWrite());//true
		System.out.println("isHidden:"+file.isHidden());//false
	}
}
