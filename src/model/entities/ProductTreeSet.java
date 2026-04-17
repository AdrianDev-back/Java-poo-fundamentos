package model.entities;

import java.util.Objects;

public class ProductTreeSet implements Comparable<ProductTreeSet> {
	
	private String name;
	private Double price;
	
	
	public ProductTreeSet(String name, Double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductTreeSet other = (ProductTreeSet) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(ProductTreeSet other) {
		return name.toUpperCase().compareTo(other.getName());
	}
	
	
	
	

}
