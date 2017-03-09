package cn.pauu.javase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：单级文件夹的复制
 */
public class CopyFolderDemo {
	public static void main(String[] args) {
		File srcFolder = new File("d:\\test\\bbb");
		File destFolder = new File("d:\\test\\ttt");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		File[] files = srcFolder.listFiles();
		for (File file : files) {
			String name = file.getName();
			File destFile = new File(destFolder, name);
			copy(file, destFile);
		}
	}

	private static void copy(File file, File destFile) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(new FileOutputStream(destFile));
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
