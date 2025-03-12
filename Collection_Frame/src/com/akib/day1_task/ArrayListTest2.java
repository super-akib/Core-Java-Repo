package com.akib.day1_task;
import java.util.ArrayList;

public class ArrayListTest2 
{
   public static void main(String args[])
   {
	   ArrayList<String> list = new ArrayList<>();
	   list.add(null);  //A
	   //null ->C
	   list.add(0,"B");
	   list.add(1,"C");
	   list.add(2,"A");
	   System.out.println(list);
   }
}
