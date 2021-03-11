package com.cg.lb.lab3.ui;

import java.util.Scanner;

public class Exercise4 {
	
	static int modifyNumber(int number1) {
		String number=String.valueOf(number1);
		StringBuffer modified=new StringBuffer("");
		for(int i=0;i<number.length()-1;i++ ) {
			int diff=number.charAt(i)-number.charAt(i+1);
			modified.append(Math.abs(diff));
		}
		modified.append(number.charAt(number.length()-1));
		return Integer.parseInt(modified.toString());
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number1=scan.nextInt();
		int modifiedNumber=modifyNumber(number1);
		System.out.println(modifiedNumber);
		scan.close();
	}

}
