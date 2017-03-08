package cn.pauu.javase.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求：4种方式实现将d:\\test\\你好java.avi复制到项目当前目录下
 * 1.基础字节流一次读取一个字节---->共耗时：146808毫秒
 * 2.基本字节流一次读取一个字节数组---->共耗时：328毫秒
 * 3.缓冲区字节流一次读取一个字节---->共耗时：1500毫秒
 * 4.缓冲区字节流一次读取一个字节数组---->共耗时：86毫秒
 */
public class CopyMp4Demo3 {
	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		// method1("d:\\test\\你好java.avi", "CopyMp4aa.avi");
		//method2("d:\\test\\你好java.avi", "CopyMp4aa.avi");
		//method3("d:\\test\\你好java.avi", "CopyMp4aa.avi");
		method4("d:\\test\\你好java.avi", "CopyMp4aa.avi");
		long endTime = System.currentTimeMillis();
		System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
	}

	// 1.基础字节流一次读取一个字节
	private static void method1(String srcString, String destString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);
		int by = 0;
		while ((by = fis.read()) != -1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}

	// 2.基本字节流一次读取一个字节数组
	private static void method2(String srcString, String destString) throws IOException {
		FileInputStream fis = new FileInputStream(srcString);
		FileOutputStream fos = new FileOutputStream(destString);
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = fis.read(bys)) != -1) {
			fos.write(bys, 0, len);
		}
		fos.close();
		fis.close();
	}

	// 3.缓冲区字节流一次读取一个字节
	private static void method3(String srcString, String destString) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
		int by = 0;
		while ((by = bis.read()) != -1) {
			bos.write(by);
		}
		bos.close();
		bis.close();
	}

	// 4.缓冲区字节流一次读取一个字节数组
	private static void method4(String srcString, String destString) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcString));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destString));
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len = bis.read(bys)) != -1) {
			bos.write(bys, 0, len);
		}
		bos.close();
		bis.close();
	}
}
