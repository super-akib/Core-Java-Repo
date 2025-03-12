package com.akib.string_builder;

public class StringBuliderMethodsDemo
{
  public static void main(String[] args)
  {  
	   // using string parameter
	   StringBuilder s1 = new StringBuilder("java");
	   s1.append(" is Programming language");
	   System.out.println(s1);
	   System.out.println("............................");
	   
	   //using Object
	   StringBuilder s2 = new StringBuilder("core");
	   String str = "java";
	   s2.append(str);
	   System.out.println(s2);
	   System.out.println("............................");
	   
	   //Using String builder
	   StringBuilder s3 = new StringBuilder("hello ");
	   StringBuilder sb = new StringBuilder("world");
	   s3.append(sb);
	   System.out.println(s3);
	   System.out.println("............................");
	   
	   //Using char array
	   StringBuilder s4 = new StringBuilder("java");
	    char ch[] = {'A','B','C'};
	    s4.append(ch);
	    System.out.println(s4);
	    System.out.println("............................");
	    
	   //Using boolean value
	    StringBuilder s5 = new StringBuilder("java");
	    s5.append(true);
	    System.out.println(s5);
	    System.out.println("............................");
	    
	   //using singl character 
	    StringBuilder s6 = new StringBuilder("java");
	    s6.append('x');
	    System.out.println(s6);
	    System.out.println("............................");
	    
	   //Using CharSequence 
	    
	    StringBuilder  s7 = new StringBuilder("welcome to ");
	    s7.append(new String("Home"));
	    System.out.println(s7);
	    System.out.println("............................");
	    
	    //using Int 
	    StringBuilder s8 = new StringBuilder("value of A=");
	    s8.append(100);
	    System.out.println(s8);
	    System.out.println("............................");
	    
	  //using long 
	    StringBuilder s9 = new StringBuilder("value of B=");
	    s9.append(100L);
	    System.out.println(s9);
	    System.out.println("............................");
	    
	  //using float 
	    StringBuilder s10 = new StringBuilder("value of C=");
	    s10.append(12.47F);
	    System.out.println(s10);
	    System.out.println("............................");
	    
	  //using double 
	    StringBuilder s11 = new StringBuilder("value of D=");
	    s11.append(3.14);
	    System.out.println(s11);
	    System.out.println("............................"); 
	  	    
  } 
  
}
