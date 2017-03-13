package cn.pauu.javase.io;

import java.io.IOException;
import java.io.Reader;

/*
 * 自定义类模拟LineNumberReader的功能
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
	 * 读一行数据
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
	 * 关闭流功能
	 */
	public void close() throws IOException {
		this.r.close();
	}
}
