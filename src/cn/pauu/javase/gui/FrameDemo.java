package cn.pauu.javase.gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("HelloWorld");
		// f.setSize(400, 300);
		// f.setLocation(400, 200);
		f.setBounds(400, 300, 400, 200);
		// 添加关闭窗体事件
		// f.addWindowListener(new WindowListener() {
		//
		// @Override
		// public void windowOpened(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowIconified(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowDeiconified(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowDeactivated(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowClosing(WindowEvent e) {
		// System.exit(0);
		// }
		//
		// @Override
		// public void windowClosed(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowActivated(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
		// 用适配器类改进
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
