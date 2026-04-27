package model.entities;

import java.util.function.Consumer;

public class ImplementConsumer implements Consumer<ProductConsumer> {

	@Override
	public void accept(ProductConsumer p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
