package com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class SeverDemo {
	public static void main(String[] args) throws IOException {
		//1、找码头
		DatagramSocket dSocket = new DatagramSocket(10000);
		//2、创建一个新的箱子
		byte[] bytes = new byte[1024];
		DatagramPacket dPacket = new DatagramPacket(bytes, bytes.length);
		//3、接收数据
		dSocket.receive(dPacket);
		//4、从箱子里面拿出数据
		byte[] data = dPacket.getData();
		System.out.println(new String(data));
		//5、拿完走羊
		dSocket.close();
	}
}
