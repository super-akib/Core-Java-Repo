package com.akib.exam28_02_24;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreData implements Serializable
{
	public static void main(String[] args) throws Exception 
	 {
		 Scanner scan = new Scanner(System.in);
		 //ArrayList is store student data
		 ArrayList<Employee>  arl = new ArrayList<>();
		//FileOutputStream used for file creation 
		 var  fout = new FileOutputStream("D://JAVA27//Employee.txt");
		 //ObjectOutputStream  it used to store object data in file 
		 var  obs = new ObjectOutputStream(fout);
		 
		 try(fout;obs;scan)
		 {
			 System.out.print("how many Employee record to store:");
			 int numberOfEmployee = scan.nextInt();
			 
			 for(int i=1;i<=numberOfEmployee;i++)
			 {   
				 Employee emp = Employee.getEmployeeObject();
				 arl.add(emp);
			 }
			 obs.writeObject(arl);			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 System.out.println("Data Store sucessfully in Employee record File....");
	 }
}
