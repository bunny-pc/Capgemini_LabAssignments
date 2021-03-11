package com.cg.lab6.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
	
	public static Map<Character,Integer> countChar(char[] arr) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(char i:arr) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}else {
				map.put(i,1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		//char[] arr={'a','b','c','d','e','d','g','h','n','d','e','d'};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter some string : ");
		char[] arr=scan.nextLine().toCharArray();
		
		Map<Character,Integer> map=countChar(arr);
		System.out.println(map.toString());
		
		scan.close();
	}

}
