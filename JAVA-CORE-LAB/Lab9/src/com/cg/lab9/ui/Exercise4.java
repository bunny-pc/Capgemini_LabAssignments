package com.cg.lab9.ui;

import java.util.Scanner;

import com.cg.lab9.service.ISameName;
import com.cg.lab9.service.Name;

public class Exercise4 {
    public static void main(String[] args) {
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the Name1 : ");
    	String name1=scan.next();
        Name name=new Name(name1);
        System.out.println("Enter the Name2 to Compare : ");
    	String name2=scan.next();
        ISameName check=name::isSame;
        boolean result=check.isSame(name2);
        if(result) {
        	System.out.println("Both Names are Same");
        }else {
        	System.out.println("Both are Different Names");
        }
        
        scan.close();
    }
}
