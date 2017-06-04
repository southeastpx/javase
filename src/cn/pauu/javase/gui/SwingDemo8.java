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
		jl1 = new JLabel("��ļ��᣺");
		jl2 = new JLabel("���εص㣺");
		String[] jg = { "����", "�Ϻ�", "����", "����" };
		jcb = new JComboBox(jg);
		String[] address = { "�ʹ�", "��կ��", "ǧ����", "��ɽ", "��������" };
		jlist = new JList(address);
		jlist.setVisibleRowCount(3);
		jsp = new JScrollPane(jlist);
		jp1.add(jl1);
		jp1.add(jcb);
		jp2.add(jl2);
		jp2.add(jsp);
		this.add(jp1);
		this.add(jp2);
		this.setTitle("�����б���ϵ");
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
