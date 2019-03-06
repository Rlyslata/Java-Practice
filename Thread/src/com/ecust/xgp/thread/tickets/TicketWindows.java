package com.ecust.xgp.thread.tickets;

public class TicketWindows extends Thread{
	/**
	 * 总票数
	 */
	private int tickets=100;
	/**
	 * 重写Thread run方法
	 */
	@Override
	public void run() {
		while(true) {
			if(tickets>0) {
				Thread th=Thread.currentThread();
				String name=th.getName();
				System.out.println(name+"正在发售第"+tickets--+"张票");
			}
		}
	}
}
