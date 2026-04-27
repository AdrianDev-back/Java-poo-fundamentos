package model.entities;

import java.util.function.Function;

public class ImplementFunction implements Function<ProductFunction, String> {

	@Override
	public String apply(ProductFunction p) {
		return p.getName().toUpperCase();
	}



}
