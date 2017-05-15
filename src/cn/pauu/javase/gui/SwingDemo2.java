package cn.pauu.javase.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * BorderLayOut布局
 * @author peng.xing
 *
 */
public class SwingDemo2 extends JFrame {
	private JButton jb1;
	private JButton jb2;
	private JButton jb3;
	private JButton jb4;
	private JButton jb5;

	public SwingDemo2() {
		this.jb1 = new JButton("中部");
		this.jb2 = new JButton("北部");
		this.jb3 = new JButton("南部");
		this.jb4 = new JButton("西部");
		this.jb5 = new JButton("东部");
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.SOUTH);
		this.add(jb4, BorderLayout.WEST);
		this.add(jb5, BorderLayout.EAST);
		this.setTitle("边界布局演示");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo2(); 
	}
}
