package entities;

public class AccountData {
	
	private int numberAccount;
	public String name;
	public double initialDeposit;
	public double deposit;
	public double withdraw;
	private double balance;
	
	public AccountData() {
		
	}
	
	public AccountData(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	public AccountData(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.initialDeposit = initialDeposit;
		this.balance = initialDeposit;	
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double draw) {
		balance += - draw - 5;
	}
	
	public String toString() {
		return " Account "
				+ numberAccount 
				+ ", Holder: "
				+ name 
				+ ", balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
