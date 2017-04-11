package cn.pauu.javase.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDPʵ������ͨ��֮���ն�
 */
public class ReceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10086);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		String ip = dp.getAddress().getHostAddress();
		String s = new String(dp.getData(),0,dp.getLength());
		System.out.println("from "+ip+" data is��"+s);
		ds.close();
	}
}
