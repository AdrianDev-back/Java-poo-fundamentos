package curso;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		if(x <= 0) {
		  System.out.println(" Not negative");
		}
		else {
			System.out.println("Positive");
		}
		
		
       sc.close();
	}

}
