package cn.pauu.javase.io;

import java.io.IOException;
import java.io.Reader;

/*
 * 需求：使用Reader模拟BufferedReader的readLine()功能
 */
public class MyBufferedReader {
	private Reader r;

	public MyBufferedReader(Reader r) {
		this.r = r;
	}

	/*
	 * 模拟readLine()功能
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
	 * 关系功能
	 */
	public void close() throws IOException {
		this.r.close();
	}
}
