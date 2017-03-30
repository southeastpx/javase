package cn.pauu.javase.thread;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 需求：定时删除项目目录aaa下的所有文件及文件夹
 */
public class TimerTest {
	public static void main(String[] args) throws ParseException {
		Timer timer = new Timer();
		final File srcFolder = new File("aaa");
		String s = "2017-03-30 20:46:50";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = sdf.parse(s);
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				deleteFolder(srcFolder);
			}

			private void deleteFolder(File srcFolder) {
				File[] files = srcFolder.listFiles();
				if (files != null) {
					for (File file : files) {
						if (file.isDirectory()) {
							deleteFolder(file);
						} else {
							System.out.println(file.getName() + "===" + file.delete());
						}
					}
					System.out.println(srcFolder.getName() + "===" + srcFolder.delete());
				}
			}
		}, d);
		//timer.cancel();
	}
}
