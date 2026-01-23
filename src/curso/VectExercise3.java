package curso;

import java.util.Locale;
import java.util.Scanner;

public class VectExercise3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.printf("EVEN NUMBERS:\n ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}
		
		System.out.println();
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) 
				count++;
		}
		
		System.out.print("Number of pairs: " + count);
		


		
		
		
		
		sc.close();
	}

}
