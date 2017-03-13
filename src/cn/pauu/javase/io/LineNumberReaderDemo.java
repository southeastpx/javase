package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
	public static void main(String[] args) {
		LineNumberReader lnr = null;
		try {
			lnr = new LineNumberReader(new FileReader("a.txt"));
			lnr.setLineNumber(15);
			String line = null;
			while ((line = lnr.readLine()) != null) {
				System.out.println(lnr.getLineNumber() + ":" + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lnr != null) {
				try {
					lnr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
