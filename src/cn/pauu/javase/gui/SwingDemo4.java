package cn.pauu.javase.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 网格布局
 * 
 * @author peng.xing
 *
 */
public class SwingDemo4 extends JFrame {
	private JButton[] jbs;
	private int size = 9;

	public SwingDemo4() {
		jbs = new JButton[size];
		for (int x = 0; x < size; x++) {
			jbs[x] = new JButton(String.valueOf(x));
			this.add(jbs[x]);
		}
		this.setTitle("网格布局");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setLayout(new GridLayout(3, 3));
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo4();
	}
}
