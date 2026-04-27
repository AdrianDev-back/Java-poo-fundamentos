package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import model.entities.ImplementConsumer;
import model.entities.ProductConsumer;

@SuppressWarnings("unused")
public class ProgramConsumer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProductConsumer> list = new ArrayList<>();
		
		list.add(new ProductConsumer("Tv", 900.00));
		list.add(new ProductConsumer("Mouse", 50.00));
		list.add(new ProductConsumer("Tablet", 350.50));
		list.add(new ProductConsumer("HD case", 80.90));
		
		//Consumer<ProductConsumer> cons = p -> {
		//	p.setPrice(p.getPrice() * 1.1);
		// };
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		//list.forEach(new ImplementConsumer());
		//list.forEach(ProductConsumer::staticPriceUpdate);
		//list.forEach(ProductConsumer::nonStaticPriceUpdate);
		//list.forEach(cons);
		
		
		list.forEach(System.out::println);
	}

}
