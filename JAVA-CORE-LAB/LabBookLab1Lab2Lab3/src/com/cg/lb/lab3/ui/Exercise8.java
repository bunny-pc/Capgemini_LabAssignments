package com.cg.lb.lab3.ui;

import java.util.Scanner;

public class Exercise8 {
	
	static boolean isPositiveString(String string) {
		boolean isPositive=true;
		int ch0,ch1;
		String str=string.toUpperCase();
		for(int i=0;i<str.length()-1;i++) {
			ch0=str.charAt(i);
			ch1=str.charAt(i+1);
			if(ch0>ch1) {
				isPositive=false;
				break;
			}
		}
		return isPositive;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String string=scan.next();
		
		if(isPositiveString(string)) {
			System.out.println(string+" is a Positive String");
		}else {
			System.out.println(string+" is a Normal String");
		}
		
		scan.close();
	}

}
