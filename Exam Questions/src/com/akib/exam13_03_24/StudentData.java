package com.akib.exam13_03_24;

import java.util.HashMap;

public class StudentData
{   
	private HashMap<String , Character>  hashMap  = new HashMap<>();
   
	public void addStudent(String name,char grade)
    {
    	hashMap.put(name, grade);
    }
	
	public void viewStudentInformation(String name)
	{
		if(hashMap.containsKey(name))
		{
			System.out.println("Student "+name+"  and grad:"+hashMap.get(name));
		}
		else
		{
			System.err.println("Student "+name+" not found");
		}
	}
	
	
	
}
