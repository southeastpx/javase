package cn.pauu.javase.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo2 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if ("886".equals(line)) {
				break;
			}
			DatagramPacket dp = new DatagramPacket(line.getBytes(), line.length(), InetAddress.getByName("127.0.0.1"),
					12345);
			ds.send(dp);
		}
		ds.close();
	}
}
