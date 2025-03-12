package com.akib.day1_task;

import java.util.ArrayList;
public class ArrayListTest3 {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<String>();
 list.add(null);
 list.add(0, "A");
 list.add(2, "B");
 list.add(1, "C");
 System.out.println(list);
 }
}