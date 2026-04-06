package entities;

public class Clerk {
	
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Clerk() {
	}
	
	public Clerk (String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHour() {
		return hours;
	}
	
	public void setHour(Integer hour) {
		this.hours = hour;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return valuePerHour * hours;
	}

}
