package com.ecust.xgp.Udp.ChatRoom;

import java.util.Scanner;

public class ChatRoom {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("欢饮进入聊天室!");
		System.out.println("请输入发送端口:");
		int sendPort=sc.nextInt();
		System.out.println("请输入接收端口:");
		int receivePort=sc.nextInt();
		System.out.println("聊天室已启动!");
		new Thread(new SendTask(sendPort),"发送端任务").start();
		new Thread(new ReceiveTask(receivePort),"接收端任务").start();
		sc.close();
	}
}
