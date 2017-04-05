package cn.pauu.javase.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("窗体点击案例");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		Button button = new Button("点击");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("你再点试试!");
			}
		});
		f.add(button);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
