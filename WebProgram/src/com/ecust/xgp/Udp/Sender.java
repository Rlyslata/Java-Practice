package com.ecust.xgp.Udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
	public static void main(String args[]) {
		/**
		 * 创建一个DatagramSocket对象
		 */
		DatagramSocket dSocket=null;
		DatagramPacket dPacket=null;
		try {
			dSocket = new DatagramSocket(3000);
		/**
		 * 要发送的数据
		 */
		String str="hello world";
		byte[] buff=str.getBytes();
		/**
		 * 创建一个要发送的数据包，数据包包含要发送的数据，数组的长度，接收端的IP地址以及端口号
		 */
		
			dPacket=new DatagramPacket(buff,buff.length,InetAddress.getByName("localhost"),8954);
		
		System.out.println("发送信息");
		dSocket.send(dPacket);;
		}catch(Exception e) {
			e.printStackTrace();
		}
		dSocket.close();
	}
}
