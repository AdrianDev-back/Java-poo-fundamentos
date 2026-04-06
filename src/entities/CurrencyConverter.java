package entities;

public class CurrencyConverter {
	
	public double price;
	public double buy;
	
	public  double reais() {
		return price * buy * 1.06;
	}

}
