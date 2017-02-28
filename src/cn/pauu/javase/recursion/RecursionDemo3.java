package cn.pauu.javase.recursion;

import java.io.File;

/*
 * 需求：递归输出D:\workspace\javase下的所有java文件的绝对路径
 */
public class RecursionDemo3 {
	public static void main(String[] args) {
		File srcFolder = new File("D:\\workspace\\javase");
		getAllJavaFilePaths(srcFolder);
	}

	private static void getAllJavaFilePaths(File srcFolder) {
		File[] files = srcFolder.listFiles();
		for(File file : files){
			if(file.isDirectory()){
				getAllJavaFilePaths(file);
			}else{
				if(file.getName().endsWith(".java")){
					System.out.println(file.getAbsolutePath());
				}
			}
		}
	}
}
