package com.ecust.xgp.Tcp.DownLoad;

import java.io.File;
import java.io.InputStream;
import java.net.Socket;


/**
 * 服务端线程任务
 * 1.接收数据
 * 2.响应客户端，发送成功接收消息
 * 3.释放资源，结束通信
 * @author acer
 *
 */
public class TcpServerTask implements Runnable{
	private Socket socket;
	
	public TcpServerTask(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int count=1;
			/**
			 * 创建上传图片目录的file对象
			 */
			File parentFile=new File("E:\\upload\\");
			/**
			 * 如果不存在就创建这个目录
			 */
			if(!parentFile.exists()) {
				parentFile.mkdir();
			}
			/**
			 * 创建.jpg文件
			 */
			File file=new File(parentFile,socket.getInetAddress().getHostAddress()+count+".jpg");
			while(file.exists()) {
				file=new File(parentFile,socket.getInetAddress().getHostAddress()+(count++)+".jpg");
			}
			java.io.FileOutputStream fos=new java.io.FileOutputStream(file);
			
			InputStream in=socket.getInputStream();
			byte[] buff=new byte[1024];
			int len=0;
			/**
			 * 直到客户端关闭输出流时，才会停止读取输入流in中的数据！
			 */
			while((len=in.read(buff))!=-1) {
				fos.write(buff, 0, len);
			}
			java.io.OutputStream out=socket.getOutputStream();
			out.write("上传成功".getBytes());
			fos.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
