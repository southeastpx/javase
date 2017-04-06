package cn.pauu.javase.gui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo5 {
	public static void main(String[] args) {
		Frame f = new Frame("QQ号检验案例");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		Label label = new Label("请输入你的QQ号，不能输入非数字：");
		TextField textField = new TextField(40);
		f.add(label);
		f.add(textField);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if (!(ch >= '0' && ch <= '9')) {
					e.consume();
				}
			}
		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
