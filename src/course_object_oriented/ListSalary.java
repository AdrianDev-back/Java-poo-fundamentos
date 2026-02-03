package course_object_oriented;

import java.util.Scanner;
import java.util.Locale;

import java.util.List;
import java.util.ArrayList;

import entities.DataEmployee;

public class ListSalary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List <DataEmployee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee " + "#" + (i+1) + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new
					DataEmployee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		DataEmployee emp = null;
		for (DataEmployee e : list) {
			if (e.getId() == idSalary) {
				emp = e;
				break;
			}
		}
		
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			double newSalary = emp.getSalary() * (1.0 + percentage / 100.0);
			emp.setSalary(newSalary);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for (DataEmployee e : list) {
			System.out.println(
				e.getId()
				+ ", " 
				+ e.getName() 
				+ ", "
				+ String.format("%.2f", e.getSalary())
				);
		}
		
		
		
		
		
		
		

		sc.close();
	}

}
