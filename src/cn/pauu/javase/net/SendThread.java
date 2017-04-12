package cn.pauu.javase.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SendThread implements Runnable {
	private DatagramSocket datagramSocket;

	public SendThread(DatagramSocket datagramSocket) {
		this.datagramSocket = datagramSocket;
	}

	@Override
	public void run() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				if ("886".equals(line)) {
					break;
				}
				byte[] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 12306);
				datagramSocket.send(dp);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (datagramSocket != null) {
				datagramSocket.close();
			}
		}
	}

}
