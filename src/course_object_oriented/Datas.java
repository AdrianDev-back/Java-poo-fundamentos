package course_object_oriented;

import java.util.Locale;
import java.util.Scanner;
import entities.DataPerson;

public class Datas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many peoples will be enters? ");
		int n = sc.nextInt();
		
		DataPerson[] vect = new DataPerson[n];
		
		sc.nextLine();
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Height of "+ (i+1) + "a person: ");
			double height = sc.nextDouble();
			
			System.out.print("Gender of " + (i+1) + "a person: ");
			char gender = sc.next().charAt(0);
			
			vect[i] = new DataPerson (height, gender);
		}
		
		double lowerHeight = vect[0].Getheighte();
		
		System.out.println();
		for (int i = 1; i < vect.length; i++) {
			if (vect[i].Getheighte() < lowerHeight) {
				lowerHeight = vect[i].Getheighte();
			}
		}
		
		System.out.printf("Lower height: %.2f\n ", lowerHeight);
		
		double greaterHeight = vect[0].Getheighte();
		
		for (int i = 1; i < vect.length; i++) {
			if (vect[i].Getheighte() > greaterHeight) {
				greaterHeight = vect[i].Getheighte();
			}
		}
		
		System.out.printf("Greater height: %.2f\n ", greaterHeight);
		
		double sum = 0.0;
	    int countF = 0;
	    
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].Getgender() == 'F') {
				sum += vect[i].Getheighte();
				countF++;
			}
		}
		
		double avgF = sum / countF;
		
		System.out.printf("Avarege height of womans: %.2f\n ", avgF);
		
		int countM = 0;
		for (int i = 0; i < vect.length; i++ ) {
			if (vect[i].Getgender() == 'M') {
				countM++;
			}
		}
		
		System.out.print("Numbers of mens: " + countM);
	
		sc.close();
	}

}
