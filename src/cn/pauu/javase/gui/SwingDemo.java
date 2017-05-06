package cn.pauu.javase.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingDemo extends JFrame{
	private JButton jButton;
	public SwingDemo() {
		this.setTitle("餐饮管理系统");
		this.setLayout(new FlowLayout(100,175,300));
		this.setSize(400,400);
		this.setLocation(200,300);
		jButton = new JButton("登录");
		this.add(jButton);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingDemo demo = new SwingDemo();
	}
}
