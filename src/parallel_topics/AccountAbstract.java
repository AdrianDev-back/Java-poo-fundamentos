package parallel_topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.AccountH;
import entities.BusinessAccountH;
import entities.SavingsAccount;

public class AccountAbstract {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<AccountH> list = new ArrayList<>();
		

		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccountH(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccountH(1005, "Anna", 500.0, 500.0));

		double sum = 0.0;
		for (AccountH acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance:  %.2f\n", sum);
		
		for(AccountH acc : list) {
			acc.deposit(10.00);
		}
		for(AccountH acc : list) {
			System.out.printf("Update balance for account %d: %.2f\n ", acc.getNumber(), acc.getBalance());
		}
		

	}

}
