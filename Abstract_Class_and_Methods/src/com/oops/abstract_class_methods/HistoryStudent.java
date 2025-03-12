package com.oops.abstract_class_methods;

public class HistoryStudent extends Student
{
   private int historyMarks;
   private int civicsMarks;
   
   public HistoryStudent(String studentName , String studentClass,int history,int civics)
   {
	   super(studentName,studentClass);
	   this.historyMarks = history;
	   this.civicsMarks = civics;
   }
   @Override 
   public int getPercentage()
   {
	   return this.historyMarks+ this.civicsMarks;
   }
}
