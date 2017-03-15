package cn.pauu.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos3.txt", true);
			for (int x = 0; x < 10; x++) {
				fos.write(("hello" + x).getBytes());
				fos.write("\r\n".getBytes());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
package cn.pauu.javase.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ����InputStreamReaderDemo2
 */
public class InputStreamReaderDemo2 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		try {
			isr = new InputStreamReader(new FileInputStream("CopyMp4Demo3.java"));
			/*
			 * //һ�ζ�ȡһ���ַ� int ch = 0; while((ch = isr.read())!=-1){
			 * System.out.print((char)ch); }
			 */
			// һ�ζ�ȡһ���ַ�����
			char[] chs = new char[1024];
			int len = 0;
			while ((len = isr.read(chs)) != -1) {
				System.out.print(new String(chs, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
package cn.pauu.javase.io;

import java.io.IOException;
import java.io.Reader;

/*
 * ����ʹ��Readerģ��BufferedReader��readLine()����
 */
public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		this.r = r;
	}

	/*
	 * ģ��readLine()����
	 */
	public String readLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while ((ch = r.read()) != -1) {
			if (ch == '\r') {
				continue;
			} else if (ch == '\n') {
				return sb.toString();
			} else {
				sb.append((char) ch);
			}
		}
		return sb.length() > 0 ? sb.toString() : null;
	}

	/*
	 * ��ϵ����
	 */
	public void close() throws IOException {
		this.r.close();
	}
}
