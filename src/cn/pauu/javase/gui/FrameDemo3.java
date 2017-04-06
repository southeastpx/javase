package cn.pauu.javase.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo3 {
	public static void main(String[] args) {
		Frame f = new Frame("数据转移");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		final TextField textField = new TextField(20);
		Button button = new Button("数据转移");
		final TextArea textArea = new TextArea(10, 40);
		f.add(textField);
		f.add(button);
		f.add(textArea);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String tfStr = textField.getText().trim();
				textField.setText("");
				textArea.append(tfStr + "\r\n");
				textField.requestFocus();
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
