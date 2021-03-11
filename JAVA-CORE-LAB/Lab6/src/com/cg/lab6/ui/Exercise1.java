package com.cg.lab6.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {
	
	public static List<Integer> getValues(HashMap<String, Integer> M) {
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(M.values());
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		HashMap<String,Integer> hashMap=new HashMap<>();
		hashMap.put("pens", 200);
		hashMap.put("books", 120);
		hashMap.put("boxs", 60);
		hashMap.put("pencil", 250);
		
		List<Integer> list=getValues(hashMap);
		System.out.println(list.toString());
	}

}
