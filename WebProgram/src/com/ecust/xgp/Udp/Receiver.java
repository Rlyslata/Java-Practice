package com.ecust.xgp.Udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
	public static void main(String args[]) {
		DatagramSocket dSocket=null;
		DatagramPacket dPacket=null;
		/**
		 * ����һ������Ϊ1024���ֽ����飬���ڽ�������
		 */
		byte[] buff=new byte[1024];
		/**
		 * ����һ��DatagramSocket�������ڼ����˿ں�8594
		 */
		try {
			dSocket=new DatagramSocket(8954);
		
		/**
		 * ����һ��DatagramPacket�������ڽ�������
		 */
		dPacket=new DatagramPacket(buff,buff.length);
		System.out.println("�ȴ�����������");
		dSocket.receive(dPacket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/**
		 * ��û�����ݻ�����
		 */
		/**
		 * ��ȡ���յ������ݣ������������ݣ����ȣ����Ͷ˵�IP��ַ�Ͷ˿ں�
		 */
		try {
		String data=new String(dPacket.getData(),0,dPacket.getLength())+"from"+
		 dPacket.getAddress().getHostAddress()+":"+dPacket.getPort();
		System.out.println(data);
		/**
		 * �ͷ���Դ
		 */
		dSocket.close();
		}catch(NullPointerException e) {
			System.out.println("�п�ָ��");
		}
	}
}
