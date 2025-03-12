package serialization_deserialization;
import java.io.Serializable;
import java.util.Scanner;
public class Customer implements Serializable
{
   private Integer customerId;
   private String customerName;
   private Double customerBill;
   
   public Customer(Integer customerId , String customerName, Double customerBill)
   {
	   super();
	   this.customerId = customerId;
	   this.customerName = customerName;
	   this.customerBill = customerBill;
   }
   
   public static Customer getCustomerObject()
   {
	   Scanner scan  =  new Scanner(System.in);
	   
	   System.out.print("Enter Customer Id:");
	   Integer customerId = scan.nextInt();
	   System.out.print("Enter Customer Name:");
	   String customerName = scan.nextLine();
	   customerName = scan.nextLine();
	   System.out.print("Enter Customer Bill:");
	   Double customerBill = scan.nextDouble();
	   
	   return new Customer(customerId, customerName, customerBill);
   }
   
   @Override
   public String toString()
   {
	   return "Customer Details [Customer Id:"+customerId+", Customer Name:"+customerName+" , Customer Bill:"+customerBill+"]";
   }
}
