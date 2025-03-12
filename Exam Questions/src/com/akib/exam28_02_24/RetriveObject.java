package com.akib.exam28_02_24;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class RetriveObject 
{
	public static void main(String[] args) throws Exception
    {
	   //Desrialization
    	var fin = new FileInputStream("D://JAVA27//Employee.txt");
    	var ois = new ObjectInputStream(fin);
    	try(fin;ois)
    	{
    		ArrayList<Employee>  arl ;
    		while((arl=(ArrayList<Employee>)ois.readObject())!=null)
    		{
    		      Iterator<Employee> list  = arl.iterator();
    		      while(list.hasNext())
    		      {
    		    	  System.out.println(list.next());
    		      }
    		}
    	}
    	catch(EOFException e)
    	{
    		System.err.println("Data read sucessfully from file ... ");
    	}
    	
	}
}
