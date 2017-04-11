package cn.pauu.javase.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo2 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(12345);
		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			String ip = dp.getAddress().getHostAddress();
			String data = new String(dp.getData(), 0, dp.getLength());
			System.out.println("from " + ip + " data is: " + data);
		}
	}
}
