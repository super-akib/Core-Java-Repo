package com.akib.day1_task;
import java.util.*;
public class VectorDemo3
{
    public static void main(String args[])
    {
    	Vector vector = new Vector(4,2);
    	
    	vector.addElement(new Integer(3));
    	vector.addElement(new Integer(4));
    	vector.addElement(new Integer(5));
    	vector.addElement(new Integer(6));
    	vector.removeAll(vector);
     System.out.println(vector.isEmpty());//true
    
    }
    //Ans: it will remove the all objects
}
 