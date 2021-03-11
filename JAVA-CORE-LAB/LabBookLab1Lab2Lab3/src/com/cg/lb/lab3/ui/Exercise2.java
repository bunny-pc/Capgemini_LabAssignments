package com.cg.lb.lab3.ui;

import java.util.Scanner;

public class Exercise2 {
	
	static String getImage(String str) {
		StringBuffer reverseString=new StringBuffer(str);
		reverseString.reverse();
		return reverseString.toString();
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String string=scan.nextLine();
		String reverseString=getImage(string);
		System.out.println(string+"|"+reverseString);
		
		scan.close();
	}

}
