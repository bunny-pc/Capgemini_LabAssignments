package com.cg.lb.lab1.ui;

import java.util.Scanner;

import com.cg.lb.lab1.model.Exercise6;

public class Exercise6App {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=Exercise6.calculateDifference(n);
		System.out.println("Difference of sum of square and squares of sum : "+sum);
		scan.close();
	}

}
