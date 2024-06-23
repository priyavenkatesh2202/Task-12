package com.example.hrtest;
import java.util.TreeMap;
import java.util.TreeSet;
public class EmployeeTreeMap 
	{

	
		public static void main(String[] args) 
			{
		        
		        TreeMap<Integer, String> employeeMap = new TreeMap<>(); 	// TreeMap to store employee IDs and names

		       
		        employeeMap.put(101, "Zoya"); 
		        employeeMap.put(102, "Nittu");    //  employee IDs and names to the TreeMap
		        employeeMap.put(103, "Shiny"); 
		        employeeMap.put(104, "Lekha"); 
		        employeeMap.put(105, "Charlie");

		        
		        TreeSet<String> sortedNames = new TreeSet<>(employeeMap.values());  //TreeSet to store the names in alphabetical order

		        
		        System.out.println("Employee names in alphabetical order:");// employee names in alphabetical order
		        for (String name : sortedNames) {
		            System.out.println(name);
		        }
		    }
		}
		
	
