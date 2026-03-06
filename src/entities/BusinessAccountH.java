package entities;

public class BusinessAccountH extends AccountH {
	
	private Double loanLimit;
	
	public BusinessAccountH() {
		super();
	}
	
	public BusinessAccountH(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	public void setLoanlimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount  - 10.0;
		}
	}

}
