package com.binay.PrototypeDesignPattern;

import java.util.List;

public class PrototypeDesignPatternDemo {
	public static void main(String[] args) throws CloneNotSupportedException{
		Employee employee = new Employee();
		employee.loadData();
		
		Employee newEmployee = (Employee) employee.clone();
		Employee newEmployee1 = (Employee) employee.clone();
		
		List<String> newEmployeeList = newEmployee.getEmployeeList();
		newEmployeeList.add("John");
		
		List<String> newEmployeeList1 = newEmployee1.getEmployeeList();
		newEmployeeList1.remove("Pankaj");
		
		System.out.println("Employee list "+employee.getEmployeeList());
		System.out.println("New Employee List "+newEmployeeList);
		System.out.println("New Employee List 1 "+newEmployeeList1);
		
	}
}
