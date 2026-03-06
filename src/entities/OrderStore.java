
package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities_enums.OrderStatusStore;

public class OrderStore {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatusStore status;
	
	private ClientStore client;
	
	private List<OrderItemStore> items = new ArrayList<OrderItemStore>();
	
	public OrderStore() {
	}
	
	public OrderStore(Date moment, OrderStatusStore status, ClientStore client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
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
	
	public ClientStore getClient() {
		return client;
	}
	
	public void setClient(ClientStore client) {
		this.client = client;
	}
	
	public void addItems(OrderItemStore item ) {
		items.add(item);
	}
	
	public void removeItems(OrderItemStore item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItemStore it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItemStore item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: ");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
