package com.cg.lb.lab2.ui;

import java.util.Arrays;

public class Exercise2 {
	
	static String [] sortString(String [] array) {
		Arrays.sort(array);
		return array;
	}
	public static void main(String[] args) {
		String [] array= {"hello","HELLO","how are you","HELLO WORLd"};
		String [] sortedArray=sortString(array);
		System.out.println("Sorted String Element in array is ");
		for(String val:sortedArray) {
			System.out.println(val);
		}

	}

}
