package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemoTcp {

	public static void main(String[] args) throws IOException {
		//1、创建socket对象
		ServerSocket ss = new ServerSocket(10000);
		//2、调用accept等待客户端连接
		System.out.println("服务器等待建立TCP连接");
		Socket socket = ss.accept();//阻塞在这里
		System.out.println("服务器已经建立TCP连接");
		//3、获得输入流对象
		InputStream is = socket.getInputStream();
		int b;
		while((b = is.read())!=-1) {//read函数也可以阻塞，当os.close()时会得到结束标记-1
			System.out.print((char)b);
		}
		//4、释放资源
		is.close();
		ss.close();
		System.out.println("服务器TCP连接已经释放");
	}

}
