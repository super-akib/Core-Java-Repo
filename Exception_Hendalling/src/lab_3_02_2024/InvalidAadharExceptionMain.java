package lab_3_02_2024;

import java.util.Scanner;

public class InvalidAadharExceptionMain
{
    public static void main(String[] args) {
		
    	Scanner scan = new Scanner(System.in);
    	try(scan)
    	{
    		System.out.print("Enter Aadhar Number:");
    		String aadharNumber = scan.nextLine();
    		if(aadharNumber.length()!=12)
    		{
    			throw new InvalidAadharException("Invalid Aadhar Number...");
    		}
    		else
    		{   			
    			System.out.println("AadharNumber is valid.");
    		}
    	}
    	catch(InvalidAadharException invalid)
    	{
    		invalid.getMessage();
    	}
	}
}
