package com.ecust.xgp.threadwithrunnable;

public class TicketWindows implements Runnable{

	/**
	 * ��Ʊ��
	 */
	private int tickets=10;
	/**
	 * ����ͬ��������
	 * ��������봴����run()����֮��
	 */
	Object lock=new Object();
	/**
	 * ��дThread run����
	 */
	@Override
	public void run() {
		while(true) {
			synchronized(lock) {
			if(tickets>0) {
				Thread th=Thread.currentThread();
				String name=th.getName();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name+"���ڷ��۵�"+tickets--+"��Ʊ");
			}
			
			}
		}
	}
	
}
