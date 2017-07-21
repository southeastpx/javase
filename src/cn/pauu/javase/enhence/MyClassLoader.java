package cn.pauu.javase.enhence;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyClassLoader extends ClassLoader {

	private String classDir;

	public MyClassLoader(String classDir) {
		super();
		this.classDir = classDir;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String srcPath = args[0];
		String destDir = args[1];
		String destFileName = srcPath.substring(srcPath.lastIndexOf("\\") + 1);
		String destPath = destDir + "\\" + destFileName;
		cypher(new FileInputStream(srcPath), new FileOutputStream(destPath));
	}

	// 加密class文件的方法
	private static void cypher(InputStream in, OutputStream out) throws IOException {
		int by = 0;
		while ((by = in.read()) != -1) {
			out.write(by ^ 0xff);
		}
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		System.out.println("aaa");
		String fileName = classDir+"\\"+name.substring(name.lastIndexOf(".")+1)+".class";
		System.out.println(fileName);
		FileInputStream fis = null;
		ByteArrayOutputStream bos = null;
		try {
			fis = new FileInputStream(fileName);
			bos = new ByteArrayOutputStream();
			cypher(fis, bos);
			byte[] bytes = bos.toByteArray();
			return defineClass(bytes, 0, bytes.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.findClass(name);
	}
}
