package Nov16;
import java.util.Scanner;
public class CreateBankAccount {

	public static void main(String[] args) {
		int  id,acc,depositAmt;
		char gender;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id :");
		id = sc.nextInt();
		System.out.print("Enter name:");
		name = sc.nextLine();
		name = sc.nextLine();
		
		System.out.print("Enter Account No:");
		acc = sc.nextInt();
		Scanner op = new Scanner(System.in);
		System.out.print("Enter your Gender:");
		gender = op.next().charAt(0);
		System.out.print("Enter amount in your Acc:");
		depositAmt = op.nextInt();
		LogicBankAccount.createAccount(id, name, acc, gender, depositAmt);
         sc.close();
         op.close();
	}

}
