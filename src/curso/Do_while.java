package curso;

import java.util.Scanner;
import java.util.Locale;

public class Do_while {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		char resp;
		do {
			
			System.out.println("Enter the temperature in Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Fahrenheit equivalent: %.1f\n", F);
			System.out.println("Do you wish to repeat (y / n");
		    resp = sc.next().charAt(0);	
	  } while (resp != 'n');
		
		sc.close();
	}

}
