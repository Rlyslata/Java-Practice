package com.ecust.xgp.Tcp;

public class Client {
	public static void main(String [] a) {
		try {
			new TcpClient().connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
