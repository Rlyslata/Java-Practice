package com.ecust.xgp.thread;

public class MyThread extends Thread{
	public void run() {
		while(true) {			
			System.out.println("MyThread类的run()方法正在运行");
		}
	}
}
