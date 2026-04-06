package curso;

import java.util.Scanner;
import java.util.Locale;


public class Ternary_conditional_expression {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price = 34.5;
		double discount = (price < 20.0) ? price * 0.1 : price * 0.05;
		
		System.out.println(discount);
		
		sc.close();
	}

}
