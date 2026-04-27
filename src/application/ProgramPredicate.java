package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class ProgramPredicate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List <Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.50));
		
		//Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		
		//list.removeIf(pred);
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product:: staticProductPredicate);
		//list.removeIf(Product:: nonStaticProductPredicate);
		list.removeIf(p -> p.getPrice() >= 100.00);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		
		
		
	}

}
