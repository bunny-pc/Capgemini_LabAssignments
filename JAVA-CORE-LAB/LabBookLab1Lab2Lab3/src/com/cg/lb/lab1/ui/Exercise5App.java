package com.cg.lb.lab1.ui;

import java.util.Scanner;

import com.cg.lb.lab1.model.Exercise5;

public class Exercise5App {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Exercise5 ex=new Exercise5();
		int sum=ex.calculateSum(n);
		System.out.println("the sum of first n natural numbers divisible by 3 or 5 : "+sum);
		scan.close();
	}
}