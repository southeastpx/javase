package cn.pauu.javase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：将d:\test\bbb下的所有文件及文件夹拷贝到c:\下
 */
public class CopyFolderDemo2 {
	public static void main(String[] args) {
		File srcFolder = new File("d:\\test\\bbb");
		File destFolder = new File("c:\\");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		copyDirectory(srcFolder, destFolder);
	}

	private static void copyDirectory(File srcFolder, File destFolder) {
		File[] files = srcFolder.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {// 目录
				File destFile = new File(destFolder,file.getName());
				destFile.mkdir();
				copyDirectory(file, destFile);
			} else {// 文件
				String name = file.getName();
				File newFile = new File(destFolder, name);
				copyFile(file, newFile);
			}
		}
	}

	private static void copyFile(File file, File newFile) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(new FileOutputStream(newFile));
			byte[] bys = new byte[1024];
			int len = 0;
			while ((len = bis.read(bys)) != -1) {
				bos.write(bys, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
