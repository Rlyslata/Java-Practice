package com.ecust.xgp.Tcp.DownLoad;

import java.io.File;
import java.io.InputStream;
import java.net.Socket;


/**
 * ������߳�����
 * 1.��������
 * 2.��Ӧ�ͻ��ˣ����ͳɹ�������Ϣ
 * 3.�ͷ���Դ������ͨ��
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
			 * �����ϴ�ͼƬĿ¼��file����
			 */
			File parentFile=new File("E:\\upload\\");
			/**
			 * ��������ھʹ������Ŀ¼
			 */
			if(!parentFile.exists()) {
				parentFile.mkdir();
			}
			/**
			 * ����.jpg�ļ�
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
			 * ֱ���ͻ��˹ر������ʱ���Ż�ֹͣ��ȡ������in�е����ݣ�
			 */
			while((len=in.read(buff))!=-1) {
				fos.write(buff, 0, len);
			}
			java.io.OutputStream out=socket.getOutputStream();
			out.write("�ϴ��ɹ�".getBytes());
			fos.close();
			out.close();
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
