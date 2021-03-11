package com.cg.lab9.ui;

import java.util.Scanner;

@FunctionalInterface
interface ChangeString {

	public String modify(String str);
}
public class Exercise2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Input String : ");
		String string=scan.next();
		ChangeString ans=(str) -> { 
			StringBuilder modify=new StringBuilder();
			char[] array=str.toCharArray();
			for(char ch :array) {
				modify.append(ch);
				modify.append(" ");
			}
			modify.deleteCharAt(modify.length()-1);
			return modify.toString();
		};
		System.out.println("Result is "+ans.modify(string));
		
		scan.close();
	}

}
