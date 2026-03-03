package entities;

public class ProductStore {
	
	private String name;
	private double price;
	
	public ProductStore() {
	}
	
	public ProductStore(String name, double Price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

}
