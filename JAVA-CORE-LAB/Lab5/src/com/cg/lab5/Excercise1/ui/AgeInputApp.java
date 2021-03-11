package com.cg.lab5.Excercise1.ui;

import java.util.Scanner;

import com.cg.lab5.Excercise1.exception.AgeException;

public class AgeInputApp {

	public static void main(String[] args) throws AgeException {
		try(Scanner scan=new Scanner(System.in)) {
			System.out.println("Enter the Age : ");
			int age=scan.nextInt();
			if(age<=15) {
				throw new AgeException("Age Invalid, Age should be above 15");
			}else {
				System.out.println("Age validated");
			}
		}catch(AgeException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
