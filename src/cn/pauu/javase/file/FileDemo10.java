package cn.pauu.javase.file;

import java.io.File;

/*
 * 批量修改d:\test\aaa下的文件名称
 * 				001_今天天气不错啊,可以出去踢球啦_巴萨.avi————>001_巴萨.avi
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
