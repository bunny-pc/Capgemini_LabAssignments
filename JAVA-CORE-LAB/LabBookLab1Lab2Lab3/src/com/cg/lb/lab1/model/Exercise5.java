package com.cg.lb.lab1.model;

public class Exercise5 {
	private int sum=0;
	public Exercise5(){
		
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int calculateSum(int n){
		int sumOfThree,sumOfFive;
		sumOfThree=3*((n/3)*((n/3)+1))/2;
		sumOfFive=5*((n/5)*((n/5)+1))/2;
		sum=sumOfThree+sumOfFive;
		return sum;
	}

}
