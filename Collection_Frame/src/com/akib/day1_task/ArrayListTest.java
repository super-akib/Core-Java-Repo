package com.akib.day1_task;
import java.util.ArrayList;
import java.util.List;
public class ArrayListTest
{
    public static void main(String args[])
    {
    	List<String>  list = new ArrayList<>();
    	list.add("Patna");
    	 list.add(0, "New York");
    	 list.add("Mumbai");
    	 list.add(2, "Sydney");
    	 System.out.println(list);
   	   
    }
}
