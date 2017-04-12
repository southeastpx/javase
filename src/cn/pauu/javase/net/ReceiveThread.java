package cn.pauu.javase.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	private DatagramSocket datagramSocket;

	public ReceiveThread(DatagramSocket datagramSocket) {
		this.datagramSocket = datagramSocket;
	}

	@Override
	public void run() {
		while(true){
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			try {
				datagramSocket.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				String data = new String(dp.getData(),0,dp.getLength());
				System.out.println("from "+ip+" data is: "+data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
