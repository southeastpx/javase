package cn.pauu.javase.gui;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import oracle.net.aso.f;

public class FrameDemo6 {
	public static void main(String[] args) {
		Frame f = new Frame("一级菜单案例");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("文件");
		MenuItem menuItem = new MenuItem("退出系统");
		menu.add(menuItem);
		menuBar.add(menu);
		f.setMenuBar(menuBar);
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
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
