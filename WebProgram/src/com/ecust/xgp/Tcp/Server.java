package com.ecust.xgp.Tcp;

public class Server {
	public static void main(String args[]) {
		try {
			new TcpServer().listen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  
}
