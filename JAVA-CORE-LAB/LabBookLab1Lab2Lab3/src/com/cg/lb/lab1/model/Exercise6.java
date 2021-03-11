package com.cg.lb.lab1.model;

public class Exercise6 {
	
	public Exercise6() {
		
	}
	public static int calculateDifference(int n){
		int sum=0,sumOfSquares,squaresOfSum;
		squaresOfSum=(n*(n+1)/2)*(n*(n+1)/2);
		sumOfSquares=(n*(n+1)*(2*n+1))/6;
		sum=sumOfSquares-squaresOfSum;
		return sum;
	}

}
