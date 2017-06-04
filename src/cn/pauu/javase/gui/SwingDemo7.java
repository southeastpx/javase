package cn.pauu.javase.gui;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SwingDemo7 extends JFrame {
	private JPanel jp1;
	private JPanel jp2;
	private JPanel jp3;
	private JLabel jl1;
	private JLabel jl2;
	private JCheckBox jcb1;
	private JCheckBox jcb2;
	private JCheckBox jcb3;
	private JRadioButton jrb1;
	private JRadioButton jrb2;
	private ButtonGroup bg;
	private JButton jb1;
	private JButton jb2;

	public SwingDemo7() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jl1 = new JLabel("你喜欢的运动：");
		jl2 = new JLabel("你的性别：");
		jcb1 = new JCheckBox("足球");
		jcb2 = new JCheckBox("篮球");
		jcb3 = new JCheckBox("网球");
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jb1 = new JButton("注册用户");
		jb2 = new JButton("取消注册");
		jp1.add(jl1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp2.add(jl2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp3.add(jb1);
		jp3.add(jb2);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.setTitle("用户注册");
		this.setLayout(new GridLayout(3, 1));
		this.setSize(300, 150);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo7();
	}

}
