package com.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientReal {
	public static void main(String[] args) throws IOException {
		System.out.println("客户端：");
		System.out.print("发送数据：");
		//1、创建码头
		DatagramSocket ds = new DatagramSocket();
		
		//2、创建消息
		
		String string;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			string = sc.next();
			
			System.out.println(string);
			byte[] bytes = string.getBytes();
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 10000);
			ds.send(dp);
			if(string.compareTo("886")==0)
				break;
		}
		//3、垃圾回收
		ds.close();
	}
}
