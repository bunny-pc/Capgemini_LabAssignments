package com.cg.lab6.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	
	public static Map<Integer,Integer> getSquares(int[] arr){
		Map<Integer,Integer> squares=new HashMap<Integer,Integer>();
		for(int i:arr) {
			if(!squares.containsKey(i)) {
				squares.put(i,i*i);
			}
		}
		return squares;
	}

	public static void main(String[] args) {
		
		//int [] arr= {1,2,3,4,5,6,7,8,9};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of Array : ");
		int len=scan.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=scan.nextInt();
		}
		Map<Integer,Integer> squaresMap=getSquares(arr);
		System.out.println(squaresMap.toString());
		scan.close();
	}

}
