package cn.pauu.javase.net;

import java.io.IOException;
import java.net.DatagramSocket;

public class CharRoom {
	public static void main(String[] args) throws IOException {
		DatagramSocket sendDatagramSocket = new DatagramSocket();
		DatagramSocket receiveDatagramSocket = new DatagramSocket(12306);
		SendThread st = new SendThread(sendDatagramSocket);
		ReceiveThread rt = new ReceiveThread(receiveDatagramSocket);
		Thread send = new Thread(st);
		Thread receive = new Thread(rt);
		send.start();
		receive.start();
	}
}
