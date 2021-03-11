package com.cg.eis.ui;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class EmployeeExceptionApp{

	public static void main(String[] args) throws EmployeeException {
		try(Scanner scan=new Scanner(System.in)){
			System.out.println("Enter the salary of Employee : ");
			if(scan.nextInt()<3000) {
				throw new EmployeeException("Salary should be above 3000");
			}else {
				System.out.println("Salary validated");
			}
		}catch(EmployeeException exp) {
			System.out.println(exp.getMessage());
		}
	}

}
