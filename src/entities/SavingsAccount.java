package entities;

public class SavingsAccount extends AccountH {
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public Double InterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(Double InterestRate) {
		this.interestRate = InterestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}

}
