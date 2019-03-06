package com.ecust.xgp.Udp.ChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendTask implements Runnable{
	private int sendPort;
	public SendTask(int sendPort) {
		this.sendPort=sendPort;
	}
	
	public int getSendPort() {
		return sendPort;
	}

	public void setSendPort(int sendPort) {
		this.sendPort = sendPort;
	}

	@Override
	public void run() {
			DatagramSocket dSocket=null;
			Scanner sc=null;
			try {
			dSocket=new DatagramSocket();
			sc=new Scanner(System.in);
			while(true) {
				String data = sc.nextLine();
				byte[] buff=data.getBytes();
				DatagramPacket dPacket=new DatagramPacket(buff,buff.length,InetAddress.getByName("127.0.0.225"),sendPort);
				dSocket.send(dPacket);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
			dSocket.close();
		}
	}
	
}
