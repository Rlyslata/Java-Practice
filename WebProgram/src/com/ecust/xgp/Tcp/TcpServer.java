package com.ecust.xgp.Tcp;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP��������
 * @author acer
 *
 */
public class TcpServer {
	/**
	 * ����һ���������˼����Ķ˿ں�
	 */
	private static final int Port=7788;
	public void listen() throws Exception {
		/**
		 * ����һ��ServerSocket����
		 */
		ServerSocket sSocket=new ServerSocket(Port);
		/**
		 * ����ServerSocaket�����accept()������������
		 */
		Socket client =sSocket.accept();
		/**
		 * ��ȡ�ͻ��������
		 */
		OutputStream osClient=client.getOutputStream();
		System.out.println("��ʼ��ͻ��˽�������");
		/**
		 * ���ͻ������ӵ������ʱ����ͻ����������
		 */
		osClient.write("�������ӵ������".getBytes());
		Thread.sleep(3000);
		System.out.println("�����ͻ���ͨ��");
		osClient.close();
		client.close();
		sSocket.close();
	}
}
