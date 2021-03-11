package com.cg.lb.lab4.model;

public class Person {
	
	private String name;
	private Integer age;
	
	public Person() {
	
	}
	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format(" name=%s, age=%s ", name, age);
	}
	
	

}
