package curso;

import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
	 // Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
	// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
	       int x = sc.nextInt();
	       int y = sc.nextInt();
	       
	       if (y == 0) {
	    	   System.out.println("Impossible to divide");
	       }
	       else {
	    	   double div = (double) x / y;
	    	   System.out.printf("%.1f ", div);
	       }
	       
		}
		
		sc.close();
	}

}
