package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import com.pauu.javase.string.GuessNumberGame;

/*
 * ������֮ǰ�Ĳ�����С��Ϸֻ����5�Σ�����5����ʾ��Ϸ����������븶�ѣ�
 */
public class PropertiesDemo5 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("count.txt"));
		int count = Integer.parseInt(prop.getProperty("count"));
		if (count > 5) {
			System.out.println("��Ϸ����������븶�ѣ�");
		} else {
			count++;
			prop.setProperty("count", String.valueOf(count));
			prop.store(new FileWriter("count.txt"), null);
			GuessNumberGame.start();
		}
	}
}
