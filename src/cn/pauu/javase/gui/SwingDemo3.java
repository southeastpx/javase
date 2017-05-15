package cn.pauu.javase.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * FlowLayOut����
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
		this.jb1 = new JButton("����");
		this.jb2 = new JButton("�ŷ�");
		this.jb3 = new JButton("�ܲ�");
		this.jb4 = new JButton("����");
		this.jb5 = new JButton("����");
		this.jb6 = new JButton("����");
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		this.setTitle("��ʽ����");
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
