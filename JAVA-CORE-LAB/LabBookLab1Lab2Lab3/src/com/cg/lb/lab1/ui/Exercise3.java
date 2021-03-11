package com.cg.lb.lab1.ui;

//import java.util.Scanner;

public class Exercise3 {
	/*
	 * 1 1 2 3 5 8 13 21 34 ...
	 */
	static int fibonacci(int first,int second,int nth) {
		int next=first+second;
		nth--;
		if(nth==0) {
			return next;
		}else {
			return fibonacci(second,next,nth);
		}
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Enther the Nth to be findout : ");
//		int nth=scan.nextInt();
		int first=1,second=1,nth=5;
		int nthFibonacci=fibonacci(first,second,nth-2);
		System.out.println(nth+" Fibonacci Number is : "+nthFibonacci);
//		scan.close();
	}

}
