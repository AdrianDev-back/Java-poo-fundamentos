package entities;

public class AccountData {
	
	private int numberAccount;
	private String name;
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
		deposit(initialDeposit);	
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getBalace() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance += - amount - 5.0;
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
