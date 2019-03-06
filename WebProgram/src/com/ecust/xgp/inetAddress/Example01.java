package com.ecust.xgp.inetAddress;

import java.net.InetAddress;

public class Example01 {
	public static void main(String args[]) throws Exception {
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.ecust.edu.cn");
		System.out.println("得到字符串形式的原始IP地址："+localAddress.getHostAddress());
		System.out.println("得到IP地址的主机名："+localAddress.getHostName());
		System.out.println("得到tokyo-hot的原始IP地址："+remoteAddress.getHostAddress());
		System.out.println("得到主机名为www.tokyo-hot.com的ip地址的主机名："+remoteAddress.getHostName());
		System.out.println("3秒是否可到达"+remoteAddress.isReachable(3000));
	}
}
