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
		
		VectHeights[] vect = new VectHeights[n];
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("Data of " + (i+1) + "a person");
			
			System.out.print("Name: ");
			name[i] = sc.next();
			
			System.out.print("Age: ");
			age[i] = sc.nextInt();
			
			System.out.print("height: ");
			height[i] = sc.nextDouble();	
		}
		
		
		double sum = 0.0;
		for (i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
		}
		
		sc.close();
	}

}
