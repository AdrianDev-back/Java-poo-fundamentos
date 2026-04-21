package parallel_topics;

import java.util.HashMap;
import java.util.Map;

import model.entities.ProductMap;

public class TestMap2 {

	public static void main(String[] args) {
		
		Map<ProductMap, Double> stock = new HashMap<>();
		
		ProductMap p1 = new ProductMap("Tv", 900.0);
		ProductMap p2 = new ProductMap("Notebook", 1200.00);
		ProductMap p3 = new ProductMap("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		ProductMap ps = new ProductMap("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
