package com.ecust.xgp.Udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
	public static void main(String args[]) {
		/**
		 * ����һ��DatagramSocket����
		 */
		DatagramSocket dSocket=null;
		DatagramPacket dPacket=null;
		try {
			dSocket = new DatagramSocket(3000);
		/**
		 * Ҫ���͵�����
		 */
		String str="hello world";
		byte[] buff=str.getBytes();
		/**
		 * ����һ��Ҫ���͵����ݰ������ݰ�����Ҫ���͵����ݣ�����ĳ��ȣ����ն˵�IP��ַ�Լ��˿ں�
		 */
		
			dPacket=new DatagramPacket(buff,buff.length,InetAddress.getByName("localhost"),8954);
		
		System.out.println("������Ϣ");
		dSocket.send(dPacket);;
		}catch(Exception e) {
			e.printStackTrace();
		}
		dSocket.close();
	}
}
