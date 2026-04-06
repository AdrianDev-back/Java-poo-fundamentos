package curso;

import java.util.Scanner;

public class Repetitive_structure_FOR {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
		int x = sc.nextInt();
		    soma += x;
		}
		
		System.out.println(soma);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Value of i: " + i);
		}
		
		for (int i = 4; i >= 0; i--) {
			System.out.println("Value of i: " + i);
		}
		
        sc.close();

	}

}
