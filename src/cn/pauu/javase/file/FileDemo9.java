package cn.pauu.javase.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo9 {
	public static void main(String[] args) {
		File file = new File("d:\\test");
		File[] files = file.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".jpg");
			}
		});
		for (File f : files) {
			System.out.println(f.getName());
		}
		System.out.println("------------------------");
		File[] files2 = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.isFile() && pathname.getName().endsWith(".jpg");
			}
		});
		for(File f : files2){
			System.out.println(f.getName());
		}
	}
}
