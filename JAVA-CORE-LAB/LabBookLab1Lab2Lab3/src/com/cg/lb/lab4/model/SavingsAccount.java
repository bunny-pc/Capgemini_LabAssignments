package com.cg.lb.lab4.model;

public class SavingsAccount extends Account{
	private final Double minimumBalance=500.0;
	@Override
	public boolean withdraw(Double amount) {
		boolean isPossible=false;
		Double balance=this.getBalance();
		if(balance-amount>minimumBalance) {
			balance-=amount;
			this.setBalance(balance);
			isPossible=true;
		}
		return isPossible;	
	}

}
