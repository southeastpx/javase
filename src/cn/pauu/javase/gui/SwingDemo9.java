package cn.pauu.javase.gui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSplitPane;

public class SwingDemo9 extends JFrame{
	private JSplitPane jsp;
	private JList jList;
	private JLabel jLabel;
	public SwingDemo9() {
		String[] jListStr = {"boy","girl","bird"};
		jList = new JList(jListStr);
		jLabel = new JLabel(new ImageIcon("images/basa.jpg"));
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jList, jLabel);
		jsp.setOneTouchExpandable(true);
		this.setLayout(new BorderLayout());
		this.setTitle("²ð·Ö´°¿ÚÑÝÊ¾");
		this.setSize(400,300);
		this.setLocation(200,200);
		this.add(jsp);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingDemo9();
	}
	
}
