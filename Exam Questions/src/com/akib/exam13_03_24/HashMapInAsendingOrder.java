package com.akib.exam13_03_24;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapInAsendingOrder
{
      public static void main(String[] args)
      {
		    HashMap<Integer,String>  hashMap = new HashMap<>();
		    
		    hashMap.put(101, "Amit");
		    hashMap.put(100, "Vijay");
		    hashMap.put(99, "Rahul");
		    
		    Set<Entry<Integer, String>> set =  hashMap.entrySet();
		     
		   set.forEach(System.out::println);
		    
	  }
}
