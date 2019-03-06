package com.ecust.xgp.threadwithrunnable;

public class MainClass {
	public static void main(String args[]) {
		TicketWindows target=new TicketWindows();
		new Thread(target,"窗口1").start();
		new Thread(target,"窗口2").start();
		new Thread(target,"窗口3").start();
		new Thread(target,"窗口4").start();
	}
}
