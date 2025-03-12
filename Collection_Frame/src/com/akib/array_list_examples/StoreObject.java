package com.akib.array_list_examples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
public class StoreObject  implements Serializable
{ 
	 public static void main(String[] args) throws Exception 
	 {
		 Scanner scan = new Scanner(System.in);
		 //ArrayList is store student data
		 ArrayList<Student>  arl = new ArrayList<>();
		//FileOutputStream used for file creation 
		 var  fout = new FileOutputStream("D:\\JAVA27\\ArrayListDemo\\Student.txt");
		 //ObjectOutputStream  it used to store object data in file 
		 var  obs = new ObjectOutputStream(fout);
		 
		 try(fout;obs;scan)
		 {
			 System.out.print("how many student record to store:");
			 int numberOfStudent = scan.nextInt();
			 
			 for(int i=1;i<=numberOfStudent;i++)
			 {   
				 Student student = Student.getStudentObject();
				 arl.add(student);
			 }
			 obs.writeObject(arl);			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println("Data Store sucessfully in Student record File....");
	 }

}
