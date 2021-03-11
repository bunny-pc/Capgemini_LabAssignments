package com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collection;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public String getInsuranceScheme(Double salary);
	public Integer addEmployee(Employee employee);
	public ArrayList<Employee> getEmployee(String insuranceScheme); 
	public boolean deleteEmployee(Integer employee);
	public Collection<Employee> displayEmployee();

}
