package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities_enums.OrderStatusStore;

public class OrderStore {
	
	private Date moment;
	private OrderStatusStore status;
	
	private List<OrderItemStore> items = new ArrayList<>();
	
	public OrderStore() {
	}
	
	public OrderStore(Date moment, OrderStatusStore status) {
		this.moment = moment;
		this.status = status;
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatusStore getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatusStore status) {
		this.status = status;
	}
	
	public List<OrderItemStore> getItems() {
		return items;
	}
	
	public void addItems(OrderItemStore item ) {
		items.add(item);
	}
	
	public void removeItems(OrderItemStore item) {
		items.add(item);
	}
	
	public double total() {
	}
}
