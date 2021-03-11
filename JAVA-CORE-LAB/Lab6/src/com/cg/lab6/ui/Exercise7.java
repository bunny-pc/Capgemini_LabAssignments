package com.cg.lab6.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {

	public static int [] getSorted(int[] arr) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i:arr) {
			StringBuilder str=new StringBuilder(String.valueOf(i));
			str.reverse();
			list.add(Integer.parseInt(str.toString()));
		}
		Collections.sort(list);
		int[] array=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			array[i]=list.get(i);
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=scan.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=scan.nextInt();
		}
		int[] sortedReverse=getSorted(arr);
		for(int i:sortedReverse) {
			System.out.print(i+"\t");
		}
		scan.close();

	}

}
