package com.example.hrtest;
import com.example.hr.Employee; // importing the class from different package


public class EmployeeTest {

	

	public static void main(String[] args)
	
	{
		
	Employee obj = new Employee();	// obj called from different package
	obj.printName();
	obj.printSalary();
	
	}

}