package model.entities;

public class ProductLambda {
	
	private String name;
	private Double price;
	
	public ProductLambda(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
	
	

}
