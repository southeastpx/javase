package cn.pauu.javase.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * BorderLayOut����
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
		this.jb1 = new JButton("�в�");
		this.jb2 = new JButton("����");
		this.jb3 = new JButton("�ϲ�");
		this.jb4 = new JButton("����");
		this.jb5 = new JButton("����");
		this.add(jb1, BorderLayout.CENTER);
		this.add(jb2, BorderLayout.NORTH);
		this.add(jb3, BorderLayout.SOUTH);
		this.add(jb4, BorderLayout.WEST);
		this.add(jb5, BorderLayout.EAST);
		this.setTitle("�߽粼����ʾ");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo2(); 
	}
}
