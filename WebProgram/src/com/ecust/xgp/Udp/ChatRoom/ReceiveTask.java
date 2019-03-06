package com.ecust.xgp.Udp.ChatRoom;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveTask implements Runnable{
	private int receivePort;
	
	public ReceiveTask(int receivePort) {
		super();
		this.receivePort = receivePort;
	}
	
	public int getReceivePort() {
		return receivePort;
	}

	public void setReceivePort(int receivePort) {
		this.receivePort = receivePort;
	}

	@Override
	public void run() {
		DatagramSocket dSocket=null;
		DatagramPacket dPacket=null;
		try {
			
			dSocket=new DatagramSocket(receivePort);
			byte[] buff=new byte[1024];
			dPacket=new DatagramPacket(buff,buff.length);
			while(true) {
				dSocket.receive(dPacket);
				String str=new String(dPacket.getData(),0,dPacket.getLength());
				System.out.println("收到"+dPacket.getAddress().getHostAddress()+"--发送的数据--"+str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dSocket.close();
		}
	}

}
