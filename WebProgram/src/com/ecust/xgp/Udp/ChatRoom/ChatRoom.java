package com.ecust.xgp.Udp.ChatRoom;

import java.util.Scanner;

public class ChatRoom {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������������!");
		System.out.println("�����뷢�Ͷ˿�:");
		int sendPort=sc.nextInt();
		System.out.println("��������ն˿�:");
		int receivePort=sc.nextInt();
		System.out.println("������������!");
		new Thread(new SendTask(sendPort),"���Ͷ�����").start();
		new Thread(new ReceiveTask(receivePort),"���ն�����").start();
		sc.close();
	}
}
