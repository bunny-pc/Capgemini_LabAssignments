package com.cg.eis.pl;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.AppMenu;
import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class App {
	private static EmployeeService employeeService;
	private static Scanner scan;
	
	public static void main(String[] args) {
		employeeService=new EmployeeServiceImpl();
		scan = new Scanner(System.in);
		
		AppMenu menu = null;

		while (menu != AppMenu.QUIT) {

			System.out.println("Choice\tMenu Item");
			System.out.println("===========================");
			for (AppMenu m : AppMenu.values()) {
				System.out.println(m.ordinal() + "\t" + m.name());
			}
			System.out.print("Choice: ");
			int choice = -1;
			if (scan.hasNextInt())
				choice = scan.nextInt();
			else {
				scan.next();
				System.out.println("Pleae choose a choice displayed");
				continue;
			}

			if (choice < 0 || choice >= AppMenu.values().length) {
				System.out.println("Invalid Choice");
			} else {
				menu = AppMenu.values()[choice];
				switch (menu) {
				case ADD:
					doAdd();
					break;
				case LIST:
					doList();
					break;
				case REMOVE:
					doRemove();
					break;
				case SEARCH:
					doSearch();
					break;
				case QUIT:
					System.out.println("Thanks!");
					break;
				}
			}

		}
		
		

		scan.close();


	}

	private static void doAdd() {
		Employee employee = new Employee();
		System.out.print("Id : ");
		employee.setId(scan.nextInt());
		System.out.print("Name : ");
		employee.setName(scan.next());
		System.out.print("salary : ");
		employee.setSalary(scan.nextDouble());
		System.out.print("Designation : ");
		employee.setDesignation(scan.next());
			
		employee.setInsuranceScheme(employeeService.getInsuranceScheme(employee.getSalary()));
		Integer id = employeeService.addEmployee(employee);
		System.out.println("employee is Added with id : " + id);
		
	}
	
	private static void doList() {
		List<Employee> employees;
		employees = (List<Employee>) employeeService.displayEmployee();
		if (employees.isEmpty()) {
			System.out.println("No employees To display");
		} else {
			for (Employee emp : employees)
				System.out.println(emp);
		}
	}
	private static void doSearch() {
		System.out.print("insurance Scheme : ");
		String scheme = scan.next();
		ArrayList<Employee> employees = employeeService.getEmployee(scheme);
		if (employees.isEmpty()) {
			System.out.println("No employees To display");
		} else {
			for (Employee emp : employees)
				System.out.println(emp);
		}
	}
	
	private static void doRemove() {
		System.out.print("id : ");
		Integer id = scan.nextInt();
		boolean isDone = employeeService.deleteEmployee(id);
		if (isDone) {
			System.out.println("employee is Deleted");
		} else {
			System.out.println("No Employee");
		}
	}

}
