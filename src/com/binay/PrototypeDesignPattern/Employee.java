package com.binay.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private List<String> empList;
	
	public Employee(){
		empList = new ArrayList<String>();
	}
	
	public Employee(List<String> list){
		this.empList =list;
	}
	
	public void loadData(){
		empList.add("Binay");
		empList.add("Sabin");
		empList.add("Basem");
		empList.add("Pankaj");
	}
	
	public List<String> getEmployeeList(){
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmployeeList()){
			temp.add(s);
		}
		
		return new Employee(temp);
		
	}
	
}
