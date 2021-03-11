package com.cg.lab8.Ex2.ui;

import com.cg.lab8.Ex2.thread.TimerThread;


public class Exercise2 {

	public static void main(String[] args) {
		TimerThread timer=new TimerThread();
		Thread t1=new Thread(timer);
		t1.start();
		
		
	}

}
