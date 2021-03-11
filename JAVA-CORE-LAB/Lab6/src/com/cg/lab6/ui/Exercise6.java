package com.cg.lab6.ui;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise6 {

	public static List<Integer> votersList(Map<Integer,LocalDate> data){
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer,LocalDate> check:data.entrySet()) {
			LocalDate date=check.getValue();
			if(Period.between(date, LocalDate.now()).getYears()>18) {
				list.add(check.getKey());
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		HashMap<Integer,LocalDate> data=new HashMap<Integer,LocalDate>();
		data.put(1001, LocalDate.of(2000, 10, 20));
		data.put(1002, LocalDate.of(2005, 01, 20));
		data.put(1003, LocalDate.of(1999, 11, 20));
		data.put(1004, LocalDate.of(1998, 01, 20));
		data.put(1005, LocalDate.of(2002, 05, 20));
		List<Integer> id=votersList(data);
		System.out.println(id.toString());
	}

}
