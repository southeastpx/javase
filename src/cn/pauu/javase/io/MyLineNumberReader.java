package cn.pauu.javase.io;

import java.io.IOException;
import java.io.Reader;

/*
 * �Զ�����ģ��LineNumberReader�Ĺ���
 */
public class MyLineNumberReader {
	private Reader r;
	private int lineNumber = 0;

	public MyLineNumberReader(Reader r) {
		this.r = r;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	/*
	 * ��һ������
	 */
	public String readLine() throws IOException {
		lineNumber++;
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
	 * �ر�������
	 */
	public void close() throws IOException {
		this.r.close();
	}
}
