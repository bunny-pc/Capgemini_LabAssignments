package com.cg.lab9.ui;

import java.util.Scanner;

@FunctionalInterface
interface XPowerOfY {

	public int power(int x,int y);
}
public class Exercise1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Base : ");
		int base=scan.nextInt();
		System.out.println("Enter the Exponent : ");
		int exponent=scan.nextInt();
		XPowerOfY ans=(x, y) -> { return (int) Math.pow(x, y); };
		System.out.println("Result is "+ans.power(base, exponent));
		
		scan.close();
	}

}
