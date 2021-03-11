package com.cg.lb.lab3.ui;

import java.util.Scanner;

public class Exercise3 {
	
	static String alterString(String str) {
		StringBuilder alterString=new StringBuilder(str);
		for(int i=0;i<alterString.length();i++) {
			if(!((alterString.toString().toLowerCase()).charAt(i)=='a'||(alterString.toString().toLowerCase()).charAt(i)=='e'||(alterString.toString().toLowerCase()).charAt(i)=='i'||(alterString.toString().toLowerCase()).charAt(i)=='o'||(alterString.toString().toLowerCase()).charAt(i)=='u')) {
				int ascii=alterString.charAt(i);
				char changed=(char) ++ascii;
				alterString.setCharAt(i, changed);
			}
		}
		return alterString.toString();
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String string=scan.nextLine();
		String alterString=alterString(string);
		System.out.println(alterString);
		scan.close();
	}

}
