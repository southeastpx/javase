package cn.pauu.javase.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingDemo5 extends JFrame {
	private JPanel jp1;
	private JPanel jp2;
	private JButton jb1;
	private JButton jb2;
	private JButton jb3;
	private JButton jb4;
	private JButton jb5;
	private JButton jb6;

	public SwingDemo5() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jb1 = new JButton("Î÷¹Ï");
		jb2 = new JButton("Æ»¹û");
		jb3 = new JButton("ÀóÖ¦");
		jb4 = new JButton("ÆÏÌÑ");
		jb5 = new JButton("éÙ×Ó");
		jb6 = new JButton("Ïã½¶");
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		this.add(jp1, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		this.setSize(300,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo5();
	}
}
