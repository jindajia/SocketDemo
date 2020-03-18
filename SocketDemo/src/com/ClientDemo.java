package com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) throws IOException {
		//1、找码头
		DatagramSocket dSocket= new DatagramSocket();
		//2、打包数据
		String string = "udp练习";
		byte[] bytes = string.getBytes();
		InetAddress address = InetAddress.getLocalHost();
		DatagramPacket dPacket= new DatagramPacket(bytes, bytes.length, address, 10000);
		//3、发送包裹
		dSocket.send(dPacket);
		//4、释放资源
		dSocket.close();
		System.out.println("fuck");
	}
}
