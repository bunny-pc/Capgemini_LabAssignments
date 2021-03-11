package com.cg.lb.lab1.ui;

import java.util.Scanner;

public class Exercise7 {
	
	static boolean checkNumber(int number) {
		boolean isTrue=true;
		int temp=number%10;
		number/=10;
		while(true) {
			int check=number%10;
			if(check>temp) {
				isTrue=false;
				break;
			}
			temp=check;
			number/=10;
			if(number==0) {
				break;
			}
		}
		return isTrue;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		if(checkNumber(number)) {
			System.out.println("Increasing Number");
		}else {
			System.out.println("Not an Increasing number");
		}
		scan.close();

	}

}
