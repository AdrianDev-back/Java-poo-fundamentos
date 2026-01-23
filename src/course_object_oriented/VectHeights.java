package course_object_oriented;

import java.util.Locale;
import java.util.Scanner;
import entities.Heights;
public class VectHeights {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many peoples will be typed: ");
		int n = sc.nextInt();
		
		Heights[] vect = new Heights[n];
		
	
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Data of " + (i+1) + "a person");
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			System.out.print("height: ");
			double height = sc.nextDouble();
			
			vect[i] = new Heights(name, age, height);
		}
		
		System.out.println();
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].Getheight();
		}
		
		double avg = sum / n;
		System.out.printf("Average Height: %.2f\n ", avg);
		
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].Getage() < 16 )
				count++;			
		}
		
		double percentage = ((double) count / vect.length) * 100.00;
		System.out.printf("Percentage of peoples with under 16: %.1f\n ", percentage);
		
		for (int i = 0; i < vect.length; i++ ) {
			if (vect[i].Getage() < 16)
				System.out.println(vect[i].Getname());
			
				
		}
		
		sc.close();
	}

}
