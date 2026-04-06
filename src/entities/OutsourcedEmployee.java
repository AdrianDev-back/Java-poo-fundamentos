package entities;

public class OutsourcedEmployee extends Clerk {
	
	private Double addicionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
		super(name, hours, valuePerHour);
		this.addicionalCharge = addicionalCharge;
	}
	
	public Double getAddicionalCharge() {
		return addicionalCharge;
	}
	
	public void setAddicionalCharge(Double addicionalCharge) {
		this.addicionalCharge = addicionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + addicionalCharge * 1.1;
	}

}
