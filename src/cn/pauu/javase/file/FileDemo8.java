package cn.pauu.javase.file;

import java.io.File;

public class FileDemo8 {
	public static void main(String[] args) {
		File file = new File("d:\\test");
		File[] files = file.listFiles();
		for(File f : files){
			if(f.isFile()){
				String fileName = f.getName();
				if(fileName.endsWith(".jpg")){
					System.out.println(fileName);
				}
			}
		}
	}
}
