package Interface;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCarRental {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter with datas of rental: ");
		System.out.println("Car model: ");
		String carModel = sc.nextLine();
		System.out.println("Withdrawal (dd/MM/yyyy hh:mm): ");
		

		
		
		sc.close();
		
	}

}
