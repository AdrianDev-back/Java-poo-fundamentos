package curso;

import java.util.Locale;
import java.util.Scanner;

abstract class VectExercise2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type a number: ");
			vect[i] = sc.nextDouble();	
		}
		
		System.out.println();
		System.out.print("VALUES: " );
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			sum += vect[i];	
		}
		
		System.out.println();
		
		double avg = sum / n;
		System.out.println("SUM = " + String.format("%.2f", sum));
		System.out.print("AVERAGE = " + String.format("%.2f", avg));
		
		
		
		sc.close();

	}

}
