package com.cg.lb.lab1.ui;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		out: do {
			System.out.println("RED\n"+"YELLOW\n"+"GREEN");
			String select=scan.next();
			switch(select) {
				case "RED": System.out.println("STOP");
							break out;
				case "YELLOW": System.out.println("READY"); 
							   break out;
				case "GREEN" : System.out.println("GO");
							   break out;
			}
		}while(true);
		scan.close();

	}

}
