package nit.array_21_02_24;

import java.util.Scanner;

/*
 WAP to store names of 10 students and their contact number corresponding in two different arrays.
 Enter  a name and search whether its in the list or not . if it is present then display the 
 name alongwith its corresponding contact number.
 */
public class Q31
{  
	public static void searchStudentName(String name[],long contact[],String studentName)
	{
		 boolean flag = false;
		 int i;
		 for(i=0;i<name.length;i++)
		 {
			 if(name[i].equalsIgnoreCase(studentName))
			 {
				 flag = true;
				 break;
			 }
		 }
		 if(flag == true)
		 {
			 System.out.print("Name:"+name[i]+"  Contact No."+contact[i]);
		 }
		 else
		 {
			 System.err.println(studentName+" is not present in List.");
		 }
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a size of array:");
		int size = scan.nextInt();
		System.out.print("Enter "+size+" student name & contact number:\n");
		String name[]= new String[size];
		long contact[] = new long[size];
		
		for(int i=0; i<name.length;i++)
		{
			System.out.print("Name:");
			name[i]= scan.next();
			System.out.print("Contact No:");
			contact[i]= scan.nextLong();
		}
		
		System.out.print("Enter name to search:");
		String studentName = scan.next();
		searchStudentName(name, contact, studentName);
		scan.close();		
	}

}
