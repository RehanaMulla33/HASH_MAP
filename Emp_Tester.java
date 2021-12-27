package com.Xworkz.Map.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Emp_Tester {

	public static void main(String[] args) {
		   
	    Map<Integer,Employee> map=new HashMap<Integer,Employee>();    
	      
	    Employee b1=new Employee(101,"Sara","Designer");    
	    Employee b2=new Employee(102,"Sana","Developer");    
	    Employee b3=new Employee(103,"Zara","Tester");    
	      
	    map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	      
	    
	    for(Map.Entry<Integer, Employee> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Employee b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.e_id+" "+b.name+" "+b.designation+" ");   
	    }    
	}
}


	   
