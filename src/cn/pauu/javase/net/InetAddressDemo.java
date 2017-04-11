package cn.pauu.javase.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress iNetAddress = InetAddress.getByName("ZJ-OA-PENG-X");
		String name = iNetAddress.getHostName();
		String address = iNetAddress.getHostAddress();
		System.out.println(name + "===" + address);
	}
}
