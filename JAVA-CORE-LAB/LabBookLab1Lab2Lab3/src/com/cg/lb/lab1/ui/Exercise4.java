package com.cg.lb.lab1.ui;

import java.util.Scanner;

public class Exercise4 {
	
	static boolean isPrime(int integer) {
		boolean isPrime=true;
		for(int i=2;i<=integer/2;i++) {
			if(integer%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enther the integer : ");
		int integer=scan.nextInt();
		for(int i=2;i<=integer;i++) {
			if(isPrime(i)) {
				System.out.print(i+"\t");
			}
		}
		scan.close();

	}

}
