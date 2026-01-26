package curso;

import java.util.Locale;
import java.util.Scanner;

public class VectExercise6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elementes will the vector have? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
		}

		double sum = 0.0;
		System.out.println();
		for (int i= 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.printf("VECTOR AVERAGE: %.3f\n ", avg);
		
		double downAvg;
		System.out.println("BELOW AVERAGE ELEMENTS: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < avg) {
			downAvg = vect[i];
			System.out.printf("%.1f\n", downAvg);
			}
		}
		

		
		
		sc.close();
	}

}
