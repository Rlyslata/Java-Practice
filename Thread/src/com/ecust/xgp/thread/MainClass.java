package com.ecust.xgp.thread;

public class MainClass {
	public static void main(String args[]) {
			Thread thread=new MyThread();
			/*
			 * �����߳�
			 */
			thread.start();
			while(true) {
				System.out.println("main����������������");
			}
		}
}
