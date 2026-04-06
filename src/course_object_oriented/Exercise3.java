package course_object_oriented;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Exercise3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Students study = new Students();
		
		study.name = sc.nextLine();
		study.grade1 = sc.nextDouble();
		study.grade2 = sc.nextDouble();
		study.grade3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + study.finalGrade());
		
		if (study.finalGrade() <= 60.00) {
			System.out.println("FAILED");
			System.out.println("MISSING: " + String.format("%.2f", study.missingPoint()) + " POINTS");
		}
		else {
			System.out.println("PASS");
		}
		
		
		sc.close();
	}

}

