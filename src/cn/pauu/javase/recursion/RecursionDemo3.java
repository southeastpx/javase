package cn.pauu.javase.recursion;

import java.io.File;

/*
 * ���󣺵ݹ����D:\workspace\javase�µ�����java�ļ��ľ���·��
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
