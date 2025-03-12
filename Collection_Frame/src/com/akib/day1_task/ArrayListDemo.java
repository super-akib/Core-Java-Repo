package com.akib.day1_task;

import java.util.*;
class ArrayListDemo 
{
public static void main(String args[])
{
   ArrayList<String> obj1 = new ArrayList<>();
   ArrayList<String> obj2 = new ArrayList<>();
   obj1.add("A");
   obj1.add("B");
   obj2.add("A");
   obj2.add(1, "B");
System.out.println(obj1.equals(obj2));
System.out.println(obj1+" : "+obj2);
  obj1.addAll(obj2);
System.out.println(obj1);
}
}