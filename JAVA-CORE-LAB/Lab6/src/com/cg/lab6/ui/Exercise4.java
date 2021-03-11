package com.cg.lab6.ui;

import java.util.HashMap;
import java.util.Map;

public class Exercise4 {

	
	public static HashMap<String,String> getStudents(HashMap<String,Integer> map){
		HashMap<String,String> medalMap=new HashMap<String,String>();
		for(Map.Entry<String,Integer> check:map.entrySet()) {
			int marks=check.getValue();
			if(marks>=90) {
				medalMap.put(check.getKey(), "Gold");
			}else if(marks>=80 && marks<90) {
				medalMap.put(check.getKey(), "Silver");
			}else if(marks>=70 && marks<80) {
				medalMap.put(check.getKey(), "Bronze");
			}else {
				medalMap.put(check.getKey(), "No Medal");
			}
		}
		return medalMap;
	}
	public static void main(String[] args) {
		HashMap<String,Integer> input=new HashMap<String,Integer>();
		input.put("17UEEC0001", 90);
		input.put("17UEEC0002", 92);
		input.put("17UEEC0003", 72);
		input.put("17UEEC0004", 88);
		input.put("17UEEC0005", 66);
		input.put("17UEEC0006", 52);
		input.put("17UEEC0007", 48);
		
		HashMap<String,String> output=getStudents(input);
		
		System.out.println(output.toString());
	}

}
