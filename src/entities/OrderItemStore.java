package entities;

public class OrderItemStore {
	
	private Integer quantity;
	private double price;
	
	public OrderItemStore() {
	}

	public OrderItemStore(Integer quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantity * price;
	}

}
