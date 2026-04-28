package model.entities;

import java.util.List;
import java.util.function.Predicate;

public class ImplementLambda {
	
	public double filteredSum(List<ProductLambda> list, Predicate<ProductLambda> criteria) {
		double sum = 0.0;
		for (ProductLambda pl : list) {
			if (criteria.test(pl)) {
				sum += pl.getPrice();
			}
			
		}
		return sum;
	}

}
