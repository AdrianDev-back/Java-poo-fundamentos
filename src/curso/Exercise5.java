package curso;

import java.util.Scanner;
import java.util.Locale;

public class Exercise5 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		//seguir, calcule e mostre o valor da conta a pagar.
		// 1.Cachorro Quente R$4.00 / 2.X-Salada R$4.50 / 3.X-Bacon R$5.00 / 4.Torrada R$2.00 / 5.Refrigerante R$1.50 
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cod = sc.nextInt();
		int amount = sc.nextInt();
		
		double bill;
		
		if (cod == 1) {
			bill = amount * 4.00;
		}
		else if (cod == 2) {
			bill = amount * 4.50;
		}
		else if (cod == 3) {
			bill = amount * 5.00;
		}
		else if (cod == 4) {
			bill = amount * 2.00;
		}
		else {
			bill = amount * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f ", bill);
		
		
		sc.close();
	}

}
