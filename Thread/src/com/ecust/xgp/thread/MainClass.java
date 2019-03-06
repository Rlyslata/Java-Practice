package com.ecust.xgp.thread;

public class MainClass {
	public static void main(String args[]) {
			Thread thread=new MyThread();
			/*
			 * 开启线程
			 */
			thread.start();
			while(true) {
				System.out.println("main（）方法正在运行");
			}
		}
}
