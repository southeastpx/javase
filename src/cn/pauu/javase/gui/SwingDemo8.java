package cn.pauu.javase.gui;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class SwingDemo8 extends JFrame {
	private JPanel jp1;
	private JPanel jp2;
	private JLabel jl1;
	private JLabel jl2;
	private JComboBox jcb;
	private JList jlist;
	private JScrollPane jsp;

	public SwingDemo8() {
		jp1 = new JPanel();
		jp2 = new JPanel();
		jl1 = new JLabel("你的籍贯：");
		jl2 = new JLabel("旅游地点：");
		String[] jg = { "北京", "上海", "苏州", "杭州" };
		jcb = new JComboBox(jg);
		String[] address = { "故宫", "九寨沟", "千岛湖", "黄山", "东方明珠" };
		jlist = new JList(address);
		jlist.setVisibleRowCount(3);
		jsp = new JScrollPane(jlist);
		jp1.add(jl1);
		jp1.add(jcb);
		jp2.add(jl2);
		jp2.add(jsp);
		this.add(jp1);
		this.add(jp2);
		this.setTitle("下拉列表联系");
		this.setLayout(new GridLayout(3, 1));
		this.setSize(500, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo8();
	}
}
