package com.akib.day1_task;
import java.util.List;
import java.util.ArrayList;

public class ArrayListTest1 
{
    public static void main(String []args)
    {
          List<String> list = new ArrayList<String>();   
          list.add("Orange");
          list.add(0,"Banana");
          
          ArrayList<String> arlist  = new ArrayList<>();
          arlist.add("Apple");
          list.add("Grapes");
          list.addAll(3,arlist);
          System.out.println(list);
    }
}
