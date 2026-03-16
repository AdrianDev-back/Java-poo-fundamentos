package entities;

public class ImportedProductY extends ProductY {
	
	private Double customFee;
	
	public ImportedProductY() {
		super();
	}
	
	
	public ImportedProductY(String name, double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	public Double getCustomFee() {
		return customFee;
	}
	
	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public Double totalPrice() {
		return price + customFee;
	}
	

	@Override
	public String priceTag() {
		return getName() 
		+ " $ " 
	    + String.format("%.2f", totalPrice()) 
	    + " (Customs fee: $ " 
	    + String.format("%.2f", getCustomFee()); 
	}
	
	
	
	

}
