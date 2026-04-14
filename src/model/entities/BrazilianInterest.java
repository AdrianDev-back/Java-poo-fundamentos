package model.entities;

import model.service.InterestService;

public class BrazilianInterest implements InterestService {
	
	private double interestRate;
	
	public BrazilianInterest(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return interestRate;
	}

}
