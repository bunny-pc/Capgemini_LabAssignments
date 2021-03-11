package com.cg.lab6.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	
	public static int getSecondSmallest(int[] arr) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i:arr) {
			list.add(i);
		}
		Collections.sort(list);
		return list.get(1);
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=scan.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=scan.nextInt();
		}
		int secondSmallest=getSecondSmallest(arr);
		System.out.println(secondSmallest);
		scan.close();
	}

}
