package com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	HashMap<Integer,Employee> employee=new HashMap<Integer,Employee>();

	@Override
	public String getInsuranceScheme(Double salary) {
		Employee employe =new Employee();
		if(salary>=5000 && salary<20000) {
			employe.setInsuranceScheme("SchemeC");
		}else if(salary>=20000 && salary<40000) {
			employe.setInsuranceScheme("SchemeB");
		}else if(salary>=40000) {
			employe.setInsuranceScheme("SchemeA");
		}
		else {
			employe.setInsuranceScheme("NoScheme");
		}
		return employe.getInsuranceScheme();
	}

	@Override
	public Integer addEmployee(Employee emp) {
		if(!employee.containsKey(emp.getId())) {
			employee.put(emp.getId(),emp);
		}
		return emp.getId();
	}

	@Override
	public ArrayList<Employee> getEmployee(String insuranceScheme) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		for(Employee emp:employee.values()) {
			if((emp.getInsuranceScheme()).equalsIgnoreCase(insuranceScheme)) {
				list.add(emp);}
		}
		return list;
	}

	@Override
	public boolean deleteEmployee(Integer employeeId) {
		boolean isDone=false;
		if(employee.containsKey(employeeId)) {
			employee.remove(employeeId);
			isDone=true;
		}
		return isDone;
	}

	@Override
	public Collection<Employee> displayEmployee() {
		List<Employee> list=new ArrayList<Employee>(employee.values());
		return list;
	}

}
