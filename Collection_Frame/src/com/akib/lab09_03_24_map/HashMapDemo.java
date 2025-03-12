package com.akib.lab09_03_24_map;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo
{
      public static void main(String args[])
      { Map<String, Integer> map = new HashMap<String, Integer>();
      map.put("T", 1);
      map.put("M", 2);
      map.keySet().add("A");
      System.out.println(map.size());



      }
}  
      