package cn.pauu.javase.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import com.pauu.javase.string.GuessNumberGame;

/*
 * 需求：让之前的猜数字小游戏只能玩5次，超过5次提示游戏试玩结束，请付费！
 */
public class PropertiesDemo5 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("count.txt"));
		int count = Integer.parseInt(prop.getProperty("count"));
		if (count > 5) {
			System.out.println("游戏试玩结束，请付费！");
		} else {
			count++;
			prop.setProperty("count", String.valueOf(count));
			prop.store(new FileWriter("count.txt"), null);
			GuessNumberGame.start();
		}
	}
}
