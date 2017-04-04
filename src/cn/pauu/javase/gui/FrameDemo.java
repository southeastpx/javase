package cn.pauu.javase.gui;

import java.awt.Frame;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("HelloWorld");
		// f.setSize(400, 300);
		// f.setLocation(400, 200);
		f.setBounds(400, 300, 400, 200);
		f.setVisible(true);
	}
}
