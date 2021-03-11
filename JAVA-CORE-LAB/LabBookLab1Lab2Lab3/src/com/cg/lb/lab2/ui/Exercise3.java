package com.cg.lb.lab2.ui;

import java.util.Arrays;

public class Exercise3 {
	
	static int [] getSorted(int [] array) {
		for(int i=0;i<array.length;i++) {
//			int reverse=0;
//			while(true) {
//				reverse=10*reverse+array[i]%10;
//				array[i]/=10;
//				if(array[i]==0) {
//					break;
//				}
//			}
			String rev="",integerString=String.valueOf(array[i]);
			for(int j=0;j<integerString.length();j++) {
				rev+=integerString.charAt(j);
			}
			array[i]=Integer.parseInt(rev);
		}
		Arrays.sort(array);
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
		int [] array= {1235,2563,256,32154};
		int [] sortedArray=getSorted(array);
		for(int val:sortedArray) {
			System.out.println(val);
		}

	}

}
