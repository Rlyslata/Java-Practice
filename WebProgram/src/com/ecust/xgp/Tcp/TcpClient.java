package com.ecust.xgp.Tcp;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	/**
	 * ����˶˿ں�
	 */
	private static final int Port=7788;
	public void connect() throws Exception{
		/**
		 * ���ӵ�����IP��ַ�Ͷ˿ںŵļ����
		 */
		Socket client=new Socket(InetAddress.getLocalHost(),Port);
		/**
		 * �õ��������ݵ���
		 */
		InputStream in=client.getInputStream();
		/**
		 * ����һ���ֽ��������ݻ�����
		 */
		byte[] buff=new byte[1024];
		int len=in.read(buff);
		System.out.println(new String(buff,0,len));
		/**
		 * �ر�Socket�����ͷ���Դ
		 */
		client.close();
	}
}
