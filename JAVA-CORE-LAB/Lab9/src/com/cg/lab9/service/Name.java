package com.cg.lab9.service;


public class Name implements ISameName{

	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name(String name) {
		super();
		this.name = name;
	}
	public Name() {
		
	}
	public boolean isSame(String name) {
		return this.name.equals(name);
	}

}
