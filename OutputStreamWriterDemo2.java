package cn.pauu.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * �ַ�����5��д����
 */
public abstract class OutputStreamWriterDemo2 {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		try {
			osw = new OutputStreamWriter(new FileOutputStream("osw2.txt"));
			// ��һ�֣�дһ���ַ�
			osw.write('a');
			osw.write(97);
			// �ڶ��֣�дһ���ַ�����
			char[] chs = { 'a', 'b', 'c', 'd', 'e' };
			osw.write(chs);
			// �����֣�дһ���ַ������һ����
			osw.write(chs, 1, 3);
			// �����֣�дһ���ַ���
			osw.write("�Ұ��й�");
			// �����֣�дһ���ַ�����һ����
			osw.write("����ȥ����", 2, 3);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (osw != null) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
