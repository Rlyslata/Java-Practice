package com.ecust.xgp.Tcp.DownLoad;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
	public static void main(String args[]) {
		try {
			Socket socket = new Socket("127.0.0.1",7788);
			OutputStream out = socket.getOutputStream();
			FileInputStream fis=new FileInputStream("E:\\1.jpg");
			byte[] buff=new byte[1024];
			int len;
			while((len=fis.read(buff))!=-1) {
				out.write(buff,0,len);
			}
			/**
			 * 关闭客户端输出流，使服务端停止读取数据
			 */
			socket.shutdownOutput();
			InputStream in=socket.getInputStream();
			len=in.read(buff);
			System.out.println(new String(buff,0,len));
			fis.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
