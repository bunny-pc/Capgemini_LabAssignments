package com.cg.lb.lab4.model;

public class Account extends Person {
	private Long accNum;
	private Double balance;
	private Person accountHolder;
	
	public Account() {
		
	}
	/**
	 * @param accNum
	 * @param balance
	 * @param accountHolder
	 */
	public Account(Long accNum, Double balance, Person accountHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accountHolder = accountHolder;
	}
	public Long getAccNum() {
		return accNum;
	}
	public void setAccNum(Long accNum) {
		this.accNum = accNum;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Person getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public boolean withdraw(Double amount) {
		boolean isPossible=false;
		if(this.balance-amount>500) {
			this.balance-=amount;
			isPossible=true;
		}
		return isPossible;	
	}
	public void deposit(Double amount) {
		this.balance+=amount;
	}
	public Double getOverdraft() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
