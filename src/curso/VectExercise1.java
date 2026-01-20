package curso;

import java.util.Scanner;

public class VectExercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.printf("NEGATIVE NUMBERS:\n ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		

		
		sc.close();
	}

}
