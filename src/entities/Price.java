package entities;

public class Price {
	
	private String name;
	private double price;
	
	public Price (String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String Getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
}
