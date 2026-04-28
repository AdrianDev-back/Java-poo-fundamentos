package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.ImplementLambda;
import model.entities.ProductLambda;

public class ProgramLambda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProductLambda> list = new ArrayList<>();
		
		list.add(new ProductLambda("Tv", 900.00));
		list.add(new ProductLambda("Mouse", 50.00));
		list.add(new ProductLambda("Tablet", 350.50));
		list.add(new ProductLambda("Hd case", 80.90));
		
		ImplementLambda pl = new ImplementLambda();
		
		double sum = pl.filteredSum(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		

	}

}