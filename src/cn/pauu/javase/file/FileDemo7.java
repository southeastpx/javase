package cn.pauu.javase.file;

import java.io.File;

public class FileDemo7 {
	public static void main(String[] args) {
		File file = new File("d:\\");
		String[] strArray = file.list();
		for(String s : strArray){
			System.out.println(s);
		}
		
		System.out.println("------------------");
		File[] files = file.listFiles();
		for(File f: files){
			System.out.println(f.getName());
		}
	}
}
