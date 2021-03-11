package com.cg.lab8.threads;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread{

	private String source;
	private String destination;
	
	public CopyDataThread(String source,String destination) {
		this.source=source;
		this.destination=destination;
	}
	
	public void run() {
		int counter=0;
		
		try {
			FileReader fr=new FileReader(source);
			FileWriter fw =new FileWriter(destination,true);
			int character=0;
			while((character=fr.read())!=-1) {
				fw.write((char)character);
				fw.flush();
				counter++;
				if(counter==10) {
					System.out.println("10 characters copied");
					counter=0;
					Thread.sleep(1000);
				}
			}
			fw.close();
			fr.close();
			System.out.println("Completed copying");
			
		} catch (IOException | InterruptedException e) {
			System.out.println(e);
		} 
	}
}
