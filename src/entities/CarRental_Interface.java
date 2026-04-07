package entities;

import java.time.LocalDateTime;

public class CarRental_Interface {
	
	private LocalDateTime start;
	private LocalDateTime finish;
	
	public CarRental_Interface () {
	}
	
	private Vehicle_Interface vehicle;
	private Invoice_Interface invoice;
	
	public CarRental_Interface(LocalDateTime start, LocalDateTime finish, Vehicle_Interface vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
	public LocalDateTime getStart() {
		return start;
	}
	
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	
	public LocalDateTime getFinish() {
		return finish;
	}
	
	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle_Interface getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle_Interface vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice_Interface getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice_Interface invoice) {
		this.invoice = invoice;
	}
	
	
}
