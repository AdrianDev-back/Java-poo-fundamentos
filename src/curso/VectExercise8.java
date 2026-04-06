package curso;

import java.util.Locale;
import java.util.Scanner;

public class VectExercise8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many peoples will you enter? ");
		int n = sc.nextInt();
		
		int[] vectAge = new int[n];
		String[] vectName = new String[n];
		
		sc.nextLine();
		
		for (int i = 0; i < n ; i++) {
			System.out.println("Data of " + (i+1) + "a person");
			
			System.out.print("Name: ");
			vectName[i] = sc.nextLine();
			
			System.out.print("Age: ");
			vectAge[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int older = 0;
		for (int i = 0; i < n; i++) {
			if (vectAge[i] > vectAge[older]) {
				older = i;
			}
		}
		
		System.out.print("OLDEST PERSON: " + vectName[older]);
	
		

		sc.close();
	}

}
