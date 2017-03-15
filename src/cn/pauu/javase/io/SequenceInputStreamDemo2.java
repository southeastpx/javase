package cn.pauu.javase.io;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * 需求：FileOutputStreamDemo3.java、InputStreamReaderDemo2.java、MyBufferedReader.java复制到
 * CopyStream2.java中
 */
public class SequenceInputStreamDemo2 {
	public static void main(String[] args) throws IOException{
		InputStream s1 = new FileInputStream("FileOutputStreamDemo3.java");
		InputStream s2 = new FileInputStream("InputStreamReaderDemo2.java");
		InputStream s3 = new FileInputStream("MyBufferedReader.java");
		Vector<InputStream> v= new Vector<InputStream>();
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		Enumeration<InputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("CopyStream2.java"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = sis.read(bys))!=-1){
			bos.write(bys, 0, len);
		}
		bos.close();
		sis.close();
	}
}
