package com.ecust.xgp.inetAddress;

import java.net.InetAddress;

public class Example01 {
	public static void main(String args[]) throws Exception {
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.ecust.edu.cn");
		System.out.println("�õ��ַ�����ʽ��ԭʼIP��ַ��"+localAddress.getHostAddress());
		System.out.println("�õ�IP��ַ����������"+localAddress.getHostName());
		System.out.println("�õ�tokyo-hot��ԭʼIP��ַ��"+remoteAddress.getHostAddress());
		System.out.println("�õ�������Ϊwww.tokyo-hot.com��ip��ַ����������"+remoteAddress.getHostName());
		System.out.println("3���Ƿ�ɵ���"+remoteAddress.isReachable(3000));
	}
}
