package com.cg.lab8.Ex2.thread;

import java.util.Date;

public class TimerThread implements Runnable{
	
	@Override
	public void run() {
//		int count=0;
		while(true) {
			System.out.println("Timer: "+ new Date());
			try {
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
//			if(count==2) {
//				break;
//			}
//			count++;
		}
	}
	

}
