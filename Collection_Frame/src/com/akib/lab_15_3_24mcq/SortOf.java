package com.akib.lab_15_3_24mcq;
import java.util.*;
public class SortOf 
{
    public static void main(String args[])
    {
    	ArrayList<Integer> a = new ArrayList<>();
    	a.add(1);
    	a.add(5);
    	a.add(3);
    	Collections.sort(a);
    	System.out.println(a);//1 3 5 2 6 9
    	a.add(2);
    	a.add(6);
    	a.add(9);
    	Collections.reverse(a);
    	System.out.println(a);
    }
}
