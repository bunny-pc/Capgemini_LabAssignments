package com.cg.lb.lab1.ui;

import java.util.Scanner;


public class Exercise8 {
	static boolean checkNumber(int n) {
		int power=(int) (Math.log(n)/Math.log(2));
		if(Math.pow(2, power)==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		if(checkNumber(number)) {
			System.out.println("Input number is an power of 2");
		}else {
			System.out.println("Input number is not a power of 2");
		}
		scan.close();
	}

}
