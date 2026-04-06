package curso;

import java.util.Locale;
import java.util.Scanner;

public class VectExercise9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be insert: ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] note1 = new double[n];
		double[] note2 = new double[n];
		
		sc.nextLine();
		
		for (int i = 0; i < name.length; i++ ) {
			System.out.println("Enter a name, first and second note of " + (i+1) + "a students: ");
			
			System.out.println("Name: ");
			name[i] = sc.nextLine();
			note1[i] = sc.nextDouble();
			note2[i] = sc.nextDouble();	
			sc.nextLine();
		}
		
		double avg = 0.0;
		System.out.println("Students approved: ");
		for (int i = 0; i < name.length; i++) {
			avg = (note1[i] + note2[i]) / 2;
			if (avg >= 6.0) {
	           System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
