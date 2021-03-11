package com.cg.lb.lab1.ui;

import java.util.Scanner;

public class Exercise1 {
	
	static int sumOfCubes(int digit) {
		int sum=0;
		while(true) {
			sum+=(int)Math.pow(digit%10,3);
			digit/=10;
			if(digit==0) {
				break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=scan.nextInt();
		System.out.println("Enter the "+n+" Digit number : ");
		int digit=scan.nextInt();
		int sumOfCubes=sumOfCubes(digit);
		System.out.println("The Sum of Cubes of Digits of "+digit+" is : "+sumOfCubes);
		scan.close();
	}

}
