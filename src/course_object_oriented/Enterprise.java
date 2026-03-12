package course_object_oriented;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Clerk;
import entities.OutsourcedEmployee;

public class Enterprise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Clerk> list = new ArrayList<Clerk>();
		
		System.out.print("Enter the number of employee: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.next();
			String nameEmp = sc.nextLine();
			System.out.print("Hours: ");
			int hoursEmp = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHourEmp = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Addicional Charge: ");
				double addicionalChargeEmp = sc.nextDouble();
				list.add(new OutsourcedEmployee(nameEmp, hoursEmp, valuePerHourEmp, addicionalChargeEmp));
			} 
			else {
				list.add(new Clerk(nameEmp, hoursEmp, valuePerHourEmp));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Clerk emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		

		sc.close();
	}

}
