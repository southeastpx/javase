package cn.pauu.javase.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * FlowLayOut布局
 * 
 * @author peng.xing
 *
 */
public class SwingDemo3 extends JFrame {
	private JButton jb1;
	private JButton jb2;
	private JButton jb3;
	private JButton jb4;
	private JButton jb5;
	private JButton jb6;

	public SwingDemo3() {
		this.jb1 = new JButton("关羽");
		this.jb2 = new JButton("张飞");
		this.jb3 = new JButton("曹操");
		this.jb4 = new JButton("吕布");
		this.jb5 = new JButton("刘备");
		this.jb6 = new JButton("赵云");
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		this.setTitle("流式布局");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo3();
	}
}
