package model.service;

public class PaypalService {
	
	public class PaypelService implements OnlinePaymentService {

		@Override
		public double paymentFee(double amount) {
			return amount * 0.02;
		}

		@Override
		public double Interest(double amount, int months) {
			return amount * 0.01 * months;
		}
		
	}

}
