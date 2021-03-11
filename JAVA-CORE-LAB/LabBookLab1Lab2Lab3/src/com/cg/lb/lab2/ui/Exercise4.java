package com.cg.lb.lab2.ui;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise4 {
	
	static Integer [] modifyArray(Integer [] array) {
		Set<Integer> arraySet=new HashSet<Integer>(Arrays.asList(array));
		arraySet.toArray(array);
		Arrays.sort(array,Collections.reverseOrder());
		return array;
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
		Integer [] array= {11,22,33,45,56,78,89};
		Integer [] modifiedArray=modifyArray(array);
		
		for(Integer val:modifiedArray) {
			System.out.println(val);
		}
	}

}
