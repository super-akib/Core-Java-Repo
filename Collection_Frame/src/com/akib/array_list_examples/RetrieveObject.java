package com.akib.array_list_examples;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class RetrieveObject 
{
    @SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception
    {
	   //Desrialization
    	var fin = new FileInputStream("D://JAVA27//ArrayListDemo//Student.txt");
    	var ois = new ObjectInputStream(fin);
    	try(fin;ois)
    	{
    		ArrayList<Student>  arl ;
    		while((arl=(ArrayList<Student>)ois.readObject())!=null)
    		{
    		      Iterator<Student> list  = arl.iterator();
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
