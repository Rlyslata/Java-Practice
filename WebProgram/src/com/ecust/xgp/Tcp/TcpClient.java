package com.ecust.xgp.Tcp;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	/**
	 * 服务端端口号
	 */
	private static final int Port=7788;
	public void connect() throws Exception{
		/**
		 * 连接到给出IP地址和端口号的计算机
		 */
		Socket client=new Socket(InetAddress.getLocalHost(),Port);
		/**
		 * 得到接收数据得流
		 */
		InputStream in=client.getInputStream();
		/**
		 * 定义一个字节数组数据缓冲区
		 */
		byte[] buff=new byte[1024];
		int len=in.read(buff);
		System.out.println(new String(buff,0,len));
		/**
		 * 关闭Socket对象释放资源
		 */
		client.close();
	}
}
