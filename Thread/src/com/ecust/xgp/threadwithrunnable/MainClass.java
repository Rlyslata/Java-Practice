package com.ecust.xgp.threadwithrunnable;

public class MainClass {
	public static void main(String args[]) {
		TicketWindows target=new TicketWindows();
		new Thread(target,"����1").start();
		new Thread(target,"����2").start();
		new Thread(target,"����3").start();
		new Thread(target,"����4").start();
	}
}
