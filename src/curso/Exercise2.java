package curso;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
		
       sc.close();
	}

}
