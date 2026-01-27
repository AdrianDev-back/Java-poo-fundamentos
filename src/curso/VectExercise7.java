package curso;

import java.util.Locale;
import java.util.Scanner;

public class VectExercise7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements will the vector have? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n]; 
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();	
		}
		
		int sumEven = 0;
		int countEven = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				sumEven += vect[i];
				countEven++;
			}	
		}
		
		if (countEven == 0) {
			System.out.println("NO EVEN NUMBER");
		}
		else {
			double avg = (double) sumEven / countEven;
			System.out.printf("AVERAGE OF EVENS = %.1f", avg);
		}
		
		
		
		 sc.close();
	}

}
