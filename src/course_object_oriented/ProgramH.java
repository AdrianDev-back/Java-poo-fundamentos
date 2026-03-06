package course_object_oriented;

import entities.AccountH;
import entities.BusinessAccountH;
import entities.SavingsAccount;

public class ProgramH {

	public static void main(String[] args) {
		
		AccountH acc = new AccountH(1001, "Alex", 0.0);
		BusinessAccountH bacc = new BusinessAccountH(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		AccountH acc1 = bacc;
		AccountH acc2 = new BusinessAccountH(1003, "Bob", 0.0, 200.0);
		AccountH acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccountH acc4 = (BusinessAccountH) acc2;
		acc4.loan(100.00);
		
		// How avoid this type of mistake >>> BusinessAccountH acc5 = (BusinessAccountH) acc3;
		if (acc3 instanceof BusinessAccountH) {
			BusinessAccountH acc5 = (BusinessAccountH) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		System.out.println(acc3.getBalance() + " | " + acc3.getHolder() );

	}

}
