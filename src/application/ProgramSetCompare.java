package application;

import java.util.HashSet;
import java.util.Set;
import model.entities.Product;

public class ProgramSetCompare {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.00));
		set.add(new Product("Notebook",1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		
		//Nesse programa o resultado é falso pois a minha classe (Product) não possui hashCode e equals implementado
		//sendo assim o HashSet compara somente as Referencias de memoria. set != prod.

		
	}

}
