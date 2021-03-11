package com.cg.lb.lab2.ui;

import java.util.Arrays;
//import java.util.Scanner;

public class Exercise1 {
	
	static int getSecondSmallest(int [] array) {
		Arrays.sort(array);
		int secondSmallest=array[1];
		return secondSmallest;
	}

	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the Length of an Array : ");
//		int len=scan.nextInt();
//		System.out.println("Enter the Elements of an array : ");
//		int [] array=new int[len];
//		for(int i=0;i<n;i++) {
//			array[i]=scan.nextInt();
//		}
		int [] array= {100,25,23,24,1,13,26,29};
		int secondSmallest=getSecondSmallest(array);
		System.out.println("Second Smallest Element in array is "+secondSmallest);
//		scan.close();
	}

}
