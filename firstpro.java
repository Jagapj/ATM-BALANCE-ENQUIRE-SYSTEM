package project;
import java.util.Scanner;
public class firstpro {
	public static void main(String[] args) {
		int account_number =1234567890;
		int password=9876;
		int main_balance=20000;
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter Account_Number : ");
        int acc_no = input.nextInt();
        System.out.print("Enter Password : ");
        int pass_wrd = input.nextInt();
        if(account_number == acc_no && password == pass_wrd)
        {
        	System.out.println("your Balance is : "+main_balance);
        	System.out.println("Do you want Recipt ?");
    		System.out.print("Enter yes/no : ");
            String rec = input.next();
			if("yes".equals(rec)) 
        	{
        	System.out.println("SBI Bank");
        	System.out.println("Your Account_Number is : "+account_number);
        	System.out.println("your Balance is : "+main_balance);
        	System.out.println("Thank You for visiting our ATM\nHave a Nice Day!");

        	}
			else if ("no".equals(rec))
        	{
        		System.out.println("SBI Bank");
            	System.out.println("Thank You for visiting our ATM\nHave a Nice Day!");
        	}
        	else
        	{
        		System.out.println("### Invalid Input ###");
        	}
        
        	}
        else
        {
        	System.out.println("### !!! ACCESS DEINED !!! ###");
        }
	}
}