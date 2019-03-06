package com.ecust.xgp.Tcp;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务器端
 * @author acer
 *
 */
public class TcpServer {
	/**
	 * 定义一个服务器端监听的端口号
	 */
	private static final int Port=7788;
	public void listen() throws Exception {
		/**
		 * 创建一个ServerSocket对象
		 */
		ServerSocket sSocket=new ServerSocket(Port);
		/**
		 * 调用ServerSocaket对象的accept()方法接收数据
		 */
		Socket client =sSocket.accept();
		/**
		 * 获取客户端输出流
		 */
		OutputStream osClient=client.getOutputStream();
		System.out.println("开始与客户端交互数据");
		/**
		 * 当客户端连接到服务端时，向客户端输出数据
		 */
		osClient.write("您已连接到服务端".getBytes());
		Thread.sleep(3000);
		System.out.println("结束客户端通信");
		osClient.close();
		client.close();
		sSocket.close();
	}
}
