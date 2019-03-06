package com.ecust.xgp.Tcp.DownLoad;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String args[]) throws Exception {
		ServerSocket dSocket=null;
		try {
			dSocket=new ServerSocket(7788);
			while(true) {
				Socket socket=dSocket.accept();
				new Thread(new TcpServerTask(socket)).start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dSocket.close();
		}
	}
}
