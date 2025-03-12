package com.oops.abstract_class_methods;

public abstract class Book
{
   private String title;
   
   public abstract void setTitle(String title);
   
   public String getTitle1()
   {
	   return this.title;
   }
   
   public void setTiltle(String title)
   {
	   this.title = title;
   }
   
   public String getTitle()
   {
	   return title;
   }
}
