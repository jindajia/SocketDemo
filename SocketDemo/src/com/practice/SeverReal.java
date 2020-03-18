package com.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SeverReal {
	public static void main(String agrs[]) throws IOException {
	
	String string = "";
	while(string.compareTo("886")!=0) {
		DatagramSocket ds = new DatagramSocket(10000);
		byte[] bytes = new byte[1000];
		DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
		ds.receive(dp);
		string = new String(dp.getData(), 0,dp.getLength());
		System.out.println(string);
		ds.close();
	}
	
	}
}
