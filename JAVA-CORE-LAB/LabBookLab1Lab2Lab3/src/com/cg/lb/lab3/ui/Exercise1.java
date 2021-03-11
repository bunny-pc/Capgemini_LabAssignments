package com.cg.lb.lab3.ui;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		StringTokenizer string = new StringTokenizer(scan.nextLine());
		int sum=0;
		while(string.hasMoreTokens()) {
			int value=Integer.parseInt(string.nextToken(" "));
			sum+=value;
			System.out.print(value+"\t");
		}
		System.out.println("\nSum of Integer are : "+sum);
		scan.close();
	}

}
