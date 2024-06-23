package com.example.hrtest;
import java.util.ArrayList;
public class RemoveArrayList
	{


	public static void main(String[] args) 
	 { 
				        
		ArrayList<String> list = new ArrayList<>();  
				  
				         
	 list.add("Make"); 
	 list.add("Hay"); 
	 list.add("While"); 
	 list.add("The"); 
	 list.add("Sunshine");
				  
				        
		System.out.println("ArrayList: " + list); // printing initial value  
				  
				         
		System.out.println("Size of ArrayList = "+ list.size()); //list size
				                            
				  
				         
		list.clear(); // clearing methods
				  
				         
	    System.out.println("\nAfter clearing the list\n\n" + "ArrayList: " + list); // printing cleared list
				                          
				  
				         
	    System.out.println("Size of ArrayList = "+ list.size()); // printing list size
				                            
		} 
	} 
	
