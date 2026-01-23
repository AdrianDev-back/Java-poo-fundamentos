package curso;

import java.util.Scanner;
import java.util.Locale;

public class VectExercise4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}
		
		int count = 0;;
		double max = vect[0];
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > max) {		
			max = vect[i];
			count = i;
		}
	}
		
		System.out.println();
		System.out.println("HIGHEST VALUE = " + max);
	
	
		System.out.print("POSITION OF GREATEST VALUE: " + count);
		
		
		
	

		sc.close();
	}

}
