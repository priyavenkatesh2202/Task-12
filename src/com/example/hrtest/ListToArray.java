package com.example.hrtest;
import java.util.LinkedList; 
import java.util.List; 
public class ListToArray {

	public static void main(String[] args) 
	    { 
	  
	         
	        List<String> list = new LinkedList<String>();  // store String in list
	  
	        list.add("Strike"); 
	        list.add("while"); 
	        list.add("the");  // list input
	        list.add("Iron"); 
	        list.add("is");
	        list.add("hot");
	  
	       
	        String[] arr = new String[list.size()]; 
	  
	        
	        for (int i = 0; i < list.size(); i++) 
	            arr[i] = list.get(i); 				// list to array
	  
	       
	        for (String x : arr) 
	            System.out.print(x + " ");  	// to print array output
	    } 
	}