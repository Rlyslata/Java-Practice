package com.ecust.xgp.threadwithrunnable;

public class TicketWindows implements Runnable{

	/**
	 * 总票数
	 */
	private int tickets=10;
	/**
	 * 定义同步锁对象
	 * 锁对象必须创建在run()方法之外
	 */
	Object lock=new Object();
	/**
	 * 重写Thread run方法
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
				System.out.println(name+"正在发售第"+tickets--+"张票");
			}
			
			}
		}
	}
	
}
