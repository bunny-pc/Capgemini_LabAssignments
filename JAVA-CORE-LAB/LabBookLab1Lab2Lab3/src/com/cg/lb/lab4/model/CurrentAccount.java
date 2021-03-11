package com.cg.lb.lab4.model;

public class CurrentAccount extends Account{
	private final static Double overdraftLimit=25000.0;
	private Double overdraft=0.0;
	@Override
	public Double getOverdraft() {
		return overdraftLimit-overdraft;
	}
	public void setOverdraft(Double overdraft) {
		this.overdraft = overdraft;
	}
	@Override
	public boolean withdraw(Double amount) {
		boolean isPossible=false;
		if(overdraft+amount<overdraftLimit) {
			overdraft+=amount;
			isPossible=true;
		}
		return isPossible;	
	}
	@Override
	public void deposit(Double amount) {
		if(overdraft-amount<0) {
			Double balance=this.getBalance();
			this.setBalance(balance+amount);
		}else {
			overdraft-=amount;
		}
	}

}
