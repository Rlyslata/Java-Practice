package com.ecust.xgp.Udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
	public static void main(String args[]) {
		DatagramSocket dSocket=null;
		DatagramPacket dPacket=null;
		/**
		 * 创建一个长度为1024的字节数组，用于接收数据
		 */
		byte[] buff=new byte[1024];
		/**
		 * 定义一个DatagramSocket对象用于监听端口号8594
		 */
		try {
			dSocket=new DatagramSocket(8954);
		
		/**
		 * 定义一个DatagramPacket对象用于接收数据
		 */
		dPacket=new DatagramPacket(buff,buff.length);
		System.out.println("等待接受数据中");
		dSocket.receive(dPacket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/**
		 * 若没有数据会阻塞
		 */
		/**
		 * 获取接收到的数据，包括数据内容，长度，发送端的IP地址和端口号
		 */
		try {
		String data=new String(dPacket.getData(),0,dPacket.getLength())+"from"+
		 dPacket.getAddress().getHostAddress()+":"+dPacket.getPort();
		System.out.println(data);
		/**
		 * 释放资源
		 */
		dSocket.close();
		}catch(NullPointerException e) {
			System.out.println("有空指针");
		}
	}
}
