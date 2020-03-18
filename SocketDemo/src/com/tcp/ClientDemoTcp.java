package com.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//用tcp建立连接发送数据
public class ClientDemoTcp {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1、创建socket对象
		Socket socket = new Socket("127.0.0.1",10000);
		//2、获取一个IO流开始写数据
		OutputStream os = socket.getOutputStream();
		os.write("hello tcp ".getBytes());
		os.write("second sentence".getBytes());
		//3、释放资源
		os.close();
		socket.close();
	}
}
