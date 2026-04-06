package course_object_oriented;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Exercise4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter convert = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		convert.price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		 convert.buy = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f ", convert.reais());
		
		
		
		sc.close();
	}

}
