package cn.pauu.javase.gui;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingDemo10 extends JFrame {
	private JScrollPane jsp;
	private JTextArea jta;
	private JPanel jpl;
	private JComboBox jcb;
	private JTextField jtf;
	private JButton jb;
	public SwingDemo10() {
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		jpl = new JPanel();
		String[] items ={"拉登","布什","奥巴马"};
		jcb = new JComboBox(items);
		jtf = new JTextField(10);
		jb = new JButton("发送");
		jpl.add(jcb);
		jpl.add(jtf);
		jpl.add(jb);
		this.setLayout(new BorderLayout());
		this.add(jsp,BorderLayout.CENTER);
		this.add(jpl,BorderLayout.SOUTH);
//		this.setIconImage((new ImageIcon("images/qq.png")));
		this.setTitle("腾讯qq");
		this.setSize(300,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingDemo10();
	}
}
