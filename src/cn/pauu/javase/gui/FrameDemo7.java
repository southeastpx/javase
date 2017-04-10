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
import java.io.IOException;

import oracle.net.aso.f;

public class FrameDemo7 {
	public static void main(String[] args) {
		final Frame f = new Frame("多级菜单");
		f.setBounds(400, 200, 400, 300);
		f.setLayout(new FlowLayout());
		final String name = f.getTitle();
		MenuBar menuBar = new MenuBar();
		Menu menu1 = new Menu("文件");
		Menu menu2 = new Menu("更改名称");
		MenuItem menuItem1 = new MenuItem("打开记事本");
		MenuItem menuItem2 = new MenuItem("退出系统");
		final MenuItem menuItem3 = new MenuItem("好好学习");
		final MenuItem menuItem4 = new MenuItem("天天向上");
		MenuItem menuItem5 = new MenuItem("恢复标题");
		menu1.add(menu2);
		menu2.add(menuItem3);
		menu2.add(menuItem4);
		menu2.add(menuItem5);
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menuBar.add(menu1);
		f.setMenuBar(menuBar);
		menuItem1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Runtime.getRuntime().exec("notepad");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		menuItem2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuItem3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(menuItem3.getLabel());
			}
		});
		menuItem4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(menuItem4.getLabel());
			}
		});
		menuItem5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(name);
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
