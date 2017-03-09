package cn.pauu.javase.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

/*
 * 需求：将d:\test\ccc\下的所有.java文件复制到d:\test\jad下,并将后缀名改为.jad
 */
public class CopyFileAndRenameDemo {
	public static void main(String[] args) {
		File srcFolder = new File("d:\\test\\ccc");
		File destFolder = new File("d:\\test\\jad");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		File[] files = srcFolder.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		for(File file : files){
			String name = file.getName();
			File newFile = new File(destFolder,name);
			copy(file,newFile);
			File renameFile = new File(destFolder,name.replace(".java", ".jad"));
			newFile.renameTo(renameFile);
		}
	}

	private static void copy(File file, File newFile) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new FileReader(file));
			bw = new BufferedWriter(new FileWriter(newFile));
			String line = null;
			while((line=br.readLine())!=null){
				bw.write(line);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
