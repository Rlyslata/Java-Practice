package com.ecust.xgp.thread.tickets;

public class TicketWindows extends Thread{
	/**
	 * ��Ʊ��
	 */
	private int tickets=100;
	/**
	 * ��дThread run����
	 */
	@Override
	public void run() {
		while(true) {
			if(tickets>0) {
				Thread th=Thread.currentThread();
				String name=th.getName();
				System.out.println(name+"���ڷ��۵�"+tickets--+"��Ʊ");
			}
		}
	}
}
