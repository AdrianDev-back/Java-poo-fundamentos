package course_object_oriented;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountData;

public class AccountBank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
	    String name = sc.nextLine();
	    System.out.print("Is there an initial deposit (y/n)? ");
	    char option = sc.next().charAt(0);
	    
	    AccountData account;
	    
	    if (option == 'y') {
	    	System.out.print("Enter initial deposit value: ");
	    	double initialDeposit = sc.nextDouble();
	        account = new AccountData(numberAccount, name, initialDeposit);		
	    } else {
	    	account = new AccountData(numberAccount, name);
	    }
	    
		System.out.println();
		System.out.println("Account data:" + account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: " + account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: " + account.toString());
		
		
		
		
		
		
		
		


		
		
		sc.close();
	}

}
