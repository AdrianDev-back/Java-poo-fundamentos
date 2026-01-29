package course_object_oriented;

import java.util.Scanner;
import entities.DataRent;

public class Pensionato {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DataRent[] vect = new DataRent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			vect[roomNumber] = new DataRent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
	
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
				
			}
		}
		
		
		
		

		
		sc.close();
	}

}
