package com.cg.lab5.excercise2.ui;

import java.util.Scanner;

import com.cg.lab5.excercise2.exception.NameException;

public class NameExceptionApp {

	public static void main(String[] args) throws NameException {
		try(Scanner scan=new Scanner(System.in)){
			
			
//			System.out.println("Enther the first Name : ");
//			String firstName=scan.next();
//			System.out.println("Enter the Last Name : ");
//			String lastName=scan.next();
			
			String firstName="";
			String lastName="";
			
			if((firstName.isEmpty() && lastName.isEmpty())) {
				throw new NameException("Full Name is not valid, It should be not blank");
			}else {
				System.out.println("Full Name is Valid "+firstName+" "+lastName);
			}
		}catch(NameException exp) {
			System.out.println(exp.getMessage());
		}

	}

}
