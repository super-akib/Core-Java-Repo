package com.akib.exam06_mar_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetFDemo 
{
     public static void main(String[] args) throws Exception 
     { 
    	 var  fout = new FileOutputStream("D://JAVA27//hashSet.txt");
    	 var  obs  = new ObjectOutputStream(fout);
    	 
    	 HashSet<String>  hs = new HashSet<>();
    	 hs.add("Camera");
    	 hs.add("Laptop");
    	 hs.add("Mobile");

    	  obs.writeObject(hs);
    	  System.out.println("Data store");
    	  
    	  var fin = new FileInputStream("D://JAVA27//hashSet.txt");
    	  var bis = new ObjectInputStream(fin);
    	  
    	  HashSet<String> h =  (HashSet<String>) bis.readObject();
    	  System.out.println(h);
	  }
}
