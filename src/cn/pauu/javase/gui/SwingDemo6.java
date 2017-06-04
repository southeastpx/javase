package cn.pauu.javase.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingDemo6 extends JFrame {
	private JPanel jp1;
	private JPanel jp2;
	private JPanel jp3;
	private JLabel jlb1;
	private JLabel jlb2;
	private JTextField jtf;
	private JPasswordField jpf;
	private JButton jb1;
	private JButton jb2;
	SwingDemo6(){
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jlb1 = new JLabel("用户名");
		jlb2 = new JLabel("密     码");
		jtf = new JTextField(10);
		jpf = new JPasswordField(10);
		jb1 = new JButton("登录");
		jb2 = new JButton("重置");
		this.setLayout(new GridLayout(3, 1));
		jp1.add(jlb1);
		jp1.add(jtf);
		jp2.add(jlb2);
		jp2.add(jpf);
		jp3.add(jb1);
		jp3.add(jb2);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.setTitle("会员管理系统");
		this.setSize(300,150);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingDemo6();
	}
}
