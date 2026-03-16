package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProductY extends ProductY {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

	private Date manufactureDate;
	
	public UsedProductY() {
		super();
	}
	
	public UsedProductY(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManuactureDate() {
		return manufactureDate;
	}
	
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
		+ " (used) $ " + String.format("%.2f", getPrice()) 
		+ " (Manufacture date: " 
	    + sdf.format(manufactureDate) + ")";  
	}

}
